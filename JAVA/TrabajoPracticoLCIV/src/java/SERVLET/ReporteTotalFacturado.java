
package SERVLET;

import GESTORES.GestorReportes;
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
@WebServlet(name = "ReporteTotalFacturado", urlPatterns = {"/ReporteTotalFacturado"})
public class ReporteTotalFacturado extends HttpServlet {

    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        GestorReportes gestor = new GestorReportes();
        gestor.TotalFacturado();
        request.setAttribute("monto", gestor);
       RequestDispatcher rd = request.getRequestDispatcher("/ReporteTotalFacturado.jsp");
       rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
    }

    

}
