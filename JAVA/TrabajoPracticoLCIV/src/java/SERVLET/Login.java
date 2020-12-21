
package SERVLET;

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
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet 
{

   
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
        rd.forward(request, response);
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String usuario = request.getParameter("txtUsuario");
        String password = request.getParameter("txtPass");
        
        if(usuario.equals("admin") && password.equals("admin"))
        {
            request.getSession().setAttribute("User", usuario);
            response.sendRedirect(getServletContext().getContextPath() + "/Index.jsp");
            
        }
        else
        {
            request.setAttribute("mensajeError", "Usuario o contraseña incorrectos");
            RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
            rd.forward(request, response);
        }    
    }

   

}
