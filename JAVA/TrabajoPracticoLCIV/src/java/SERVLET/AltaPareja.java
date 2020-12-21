
package SERVLET;

import GESTORES.CargarCombo;
import GESTORES.GestorParejas;
import MODELO.Pareja;
import MODELO.Provincia;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(name = "AltaPareja", urlPatterns = {"/AltaPareja"})
public class AltaPareja extends HttpServlet 
{

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        // Envia al jsp los datos para mostrar el combo en la pantalla
        CargarCombo combo = new CargarCombo();
        ArrayList<Provincia> lista = combo.obtenerProvincia();
        request.setAttribute("listadoProvincia", lista);
        RequestDispatcher rd = request.getRequestDispatcher("VistasParejas/AltaPareja.jsp");
        rd.forward(request, response);
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        // Capturar los datos del formulario
        String primerConyuge = request.getParameter("txtPrimerConyuge");
        String segundoConyuge = request.getParameter("txtSegundoConyuge");
        String telefono = request.getParameter("txtTelefono");
        String domicilio = request.getParameter("txtDomicilio");
        String ciudad = request.getParameter("txtCiudad");
        int Idprovincia = Integer.parseInt(request.getParameter("cmbProvincia"));
        
        Provincia provincia = new Provincia();
        provincia.setIdProvincia(Idprovincia);
        Pareja pareja = new Pareja(0, primerConyuge, segundoConyuge, telefono, domicilio, ciudad, provincia);
        
        GestorParejas gestor = new GestorParejas();
        if(!primerConyuge.equals("")&& !segundoConyuge.equals("") && !telefono.equals("") && !domicilio.equals("")&& !ciudad.equals(""))
        {
            gestor.altaPareja(pareja); // Agrego la pareja
        }
        else
        {
            RequestDispatcher rd = request.getRequestDispatcher("pantallaError.jsp");
            rd.forward(request, response);
        }
        
        
        //Redirigo a listado de pareja
        request.setAttribute("ListadoParejas", gestor.consultarParejas());
        RequestDispatcher rd = request.getRequestDispatcher("VistasParejas/ListadoParejasEdicion.jsp");
        rd.forward(request, response);
    }

}
