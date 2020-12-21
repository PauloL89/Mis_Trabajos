
package SERVLET;


import GESTORES.GestorDepositos;
import GESTORES.GestorParejas;
import MODELO.Deposito;
import MODELO.Pareja;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AltaDeposito", urlPatterns = {"/AltaDeposito"})
public class AltaDeposito extends HttpServlet {

    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String modo = request.getParameter("modo");
        
        if(modo == null || modo.isEmpty())
        {

            RequestDispatcher rd = request.getRequestDispatcher("VistasArticulos/ListadoParejasEdicion.jsp");
            rd.forward(request, response);
        }
        else if(modo.equals("alta"))
        {
            
            int idPareja = Integer.parseInt(request.getParameter("id")); // capturamos el id a actualizar, viene de la url
            
            GestorParejas gestorPareja = new GestorParejas();
            Pareja pareja = gestorPareja.obtenerParejaPorId(idPareja);
            
            request.setAttribute("modeloDeposito", pareja); // crea el atributo modeloDeposito
            
            
            RequestDispatcher rd = request.getRequestDispatcher("/RegistrarDeposito.jsp");
            rd.forward(request, response);
            
            
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        int idPareja = Integer.parseInt(request.getParameter("idPareja"));
        GestorDepositos gestor = new GestorDepositos();
        
        String nombreInvitado = request.getParameter("txtNombreInvitado");
        String apellidoInvitado = request.getParameter("txtApellidoInvitado");
        String telefonoInvitado = request.getParameter("txtTelefonoInvitado");
        float montoDeposito = Float.parseFloat(request.getParameter("txtMonto"));
        
        
       Pareja pareja = new Pareja();
       pareja.setIdPareja(idPareja);
        
        Deposito deposito = new Deposito(0, montoDeposito, pareja, nombreInvitado, apellidoInvitado, telefonoInvitado);
        
        
        gestor.altaDeposito(deposito);
        
        
             float saldo = gestor.consultarDeposito(idPareja);
            //Actualiza el saldo de la pareja en la bd
            gestor.actualizarSaldo(saldo, idPareja);
            pareja.setSaldo(saldo);
        
        
        GestorParejas gestorPareja = new GestorParejas();
        request.setAttribute("ListadoParejas", gestorPareja.consultarParejas());
        RequestDispatcher rd = request.getRequestDispatcher("VistasParejas/ListadoParejasEdicion.jsp");
        rd.forward(request, response);
    }



}
