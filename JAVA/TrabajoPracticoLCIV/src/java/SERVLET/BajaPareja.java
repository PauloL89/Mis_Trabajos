
package SERVLET;

import GESTORES.CargarCombo;
import GESTORES.GestorParejas;
import MODELO.Pareja;
import MODELO.Provincia;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "BajaPareja", urlPatterns = {"/BajaPareja"})
public class BajaPareja extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        GestorParejas gestor = new GestorParejas();
        String modo = request.getParameter("modo");
        
        if(modo == null || modo.isEmpty())
        {
            //request.setAttribute("Parejas", gestor.consultarParejas());

            RequestDispatcher rd = request.getRequestDispatcher("VistasParejas/ListadoParejasEdicion.jsp");
            rd.forward(request, response);
        }
        else if(modo.equals("eliminar"))
        {
            int idPareja = Integer.parseInt(request.getParameter("id")); // capturamos el id a actualizar
            
            Pareja pareja = gestor.obtenerParejaPorId(idPareja);
            
            request.setAttribute("modeloPareja", pareja); // crea el atributo modeloPareja
            
           
            RequestDispatcher rd = request.getRequestDispatcher("VistasParejas/BajaPareja.jsp");
            rd.forward(request, response);
            
        }
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        int idPareja = Integer.parseInt(request.getParameter("idPareja")); // capturamos el id 
        
        GestorParejas gestor = new GestorParejas();
        Pareja pareja = gestor.obtenerParejaPorId(idPareja);
        
        gestor.eliminarPareja(pareja.getIdPareja());
        
        request.setAttribute("ListadoParejas", gestor.consultarParejas());
        RequestDispatcher rd = request.getRequestDispatcher("VistasParejas/ListadoParejasEdicion.jsp");
        rd.forward(request, response);
    }

   

}
