/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVLET;

import GESTORES.GestorArticulos;
import GESTORES.GestorCompras;
import GESTORES.GestorDepositos;
import GESTORES.GestorParejas;
import MODELO.Articulo;
import MODELO.DetalleVenta;
import MODELO.Pareja;
import MODELO.Venta;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Paulo_PC
 */
@WebServlet(name = "RegistrarCompra", urlPatterns = {"/RegistrarCompra"})
public class RegistrarCompra extends HttpServlet 
{

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        GestorParejas gestorParejas = new GestorParejas();
        String modo = request.getParameter("modo"); // Crea el parametro modo

        if (modo == null || modo.isEmpty())
        {

            RequestDispatcher rd = request.getRequestDispatcher("VistasParejas/ListadoParejasEdicion.jsp");
            rd.forward(request, response);
        } 
        else if (modo.equals("venta"))
        {
            int idPareja = Integer.parseInt(request.getParameter("idPareja")); // capturamos el id a actualizar

            Pareja pareja = gestorParejas.obtenerParejaPorId(idPareja);

            request.setAttribute("modeloPareja", pareja); // crea el atributo modeloPareja

            // Mostrar el total depositado a la pareja
            GestorDepositos gestorDepositos = new GestorDepositos();
            gestorDepositos.consultarDeposito(idPareja);
            
           request.setAttribute("modeloDeposito", gestorDepositos);
            
            // Carga de combo de articulos
            GestorArticulos combo = new GestorArticulos();
            ArrayList<Articulo> lista = combo.consultarArticulos();

            request.setAttribute("listadoArticulos", lista);
            
            // Redirige a la pantalla registrar compra
            RequestDispatcher rd = request.getRequestDispatcher("VistasRegistrarVenta/RegistrarCompra.jsp");
            rd.forward(request, response);

        }

    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        
        // Obtener el IdPareja
        int idPareja = Integer.parseInt(request.getParameter("idPareja"));
        GestorParejas gestorParejas = new GestorParejas();
        Pareja pareja = gestorParejas.obtenerParejaPorId(idPareja);
        
        //Obtener IdArticulo
        int idArticulo = Integer.parseInt(request.getParameter("cmbArticulo"));
        GestorArticulos gestorArticulos = new GestorArticulos();
        Articulo articulo = gestorArticulos.obtenerArticuloPorId(idArticulo);
        
        GestorDepositos gestorDepositos = new GestorDepositos();
        
        //Obtener el saldo disponible de la pareja
        pareja.setSaldo(gestorDepositos.consultarDeposito(idPareja));
         
        if(articulo.getPrecioUnitario() <= pareja.getSaldo())
        {
            // obtengo fecha actual
            LocalDate fecha = LocalDate.now();
            String fechaVenta = String.valueOf(fecha);
            
            // Registro venta
            Venta venta = new Venta(0,fechaVenta, pareja);
            GestorCompras compra = new GestorCompras();
            compra.altaCompra(venta);
            
            // actualizar saldo(Total a pagar - saldo)
            float nuevoSaldo = pareja.getSaldo() - articulo.getPrecioUnitario();
            gestorDepositos.actualizarSaldo(nuevoSaldo, idPareja); 
            
            
             // PARA LA TABLA DETALLE VENTA:
             //obtengo el id de la venta
             int idVenta = compra.obtenerIdVenta();
             // seteo ese id
             venta.setIdVenta(idVenta);
             DetalleVenta detalle = new DetalleVenta(0, venta, articulo,articulo.getPrecioUnitario());
             compra.altaDetalleCompra(detalle); // agrego el detalle de la venta
             
             //Actualizo estado de los depositos
             gestorDepositos.actualizarEstadoDeposito(idPareja);
             
            //Redirigir a una pantalla de confirmacion
            RequestDispatcher rd = request.getRequestDispatcher("VistasRegistrarVenta/ConfirmacionCompra.jsp");
            rd.forward(request, response);
        }
        else
        {
            //Redirigir a una pantalla de compra fallida
            RequestDispatcher rd = request.getRequestDispatcher("VistasRegistrarVenta/CompraRechazada.jsp");
            rd.forward(request, response);
        }

    }


}
