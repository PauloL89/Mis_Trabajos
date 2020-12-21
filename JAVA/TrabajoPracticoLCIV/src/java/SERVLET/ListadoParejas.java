
package SERVLET;

import GESTORES.GestorParejas;
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
@WebServlet(name = "ListadoParejas", urlPatterns = {"/ListadoParejas"})
public class ListadoParejas extends HttpServlet 
{

    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       GestorParejas gestor = new GestorParejas();
       
       request.setAttribute("ListadoParejas", gestor.consultarParejas());
       RequestDispatcher rd = request.getRequestDispatcher("VistasParejas/ListadoParejas.jsp");
       rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
    }

    

}
