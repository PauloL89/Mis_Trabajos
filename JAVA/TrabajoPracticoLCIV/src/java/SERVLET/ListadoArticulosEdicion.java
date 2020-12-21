
package SERVLET;

import GESTORES.GestorArticulos;
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
@WebServlet(name = "ListadoArticulosEdicion", urlPatterns = {"/ListadoArticulosEdicion"})
public class ListadoArticulosEdicion extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        GestorArticulos gestor = new GestorArticulos();
       
       request.setAttribute("ListadoArticulo", gestor.consultarArticulos());
       RequestDispatcher rd = request.getRequestDispatcher("VistasArticulos/ListadoArticulosEdicion.jsp");
       rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        
    }

    

}
