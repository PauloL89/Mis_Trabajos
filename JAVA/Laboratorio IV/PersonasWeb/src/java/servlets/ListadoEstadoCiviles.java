
package servlets;

import gestores.GestorPersonas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.EstadoCivil;


@WebServlet(name = "ListadoEstadoCiviles", urlPatterns = {"/ListadoEstadoCiviles"})
public class ListadoEstadoCiviles extends HttpServlet {

    
    protected void Responder(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListadoEstadoCiviles</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>LISTADO DE ESTADO CIVILES</h1>");
            
            GestorPersonas gestor = new GestorPersonas();
            
            ArrayList<EstadoCivil> lista = gestor.obtenerEstadosCiviles();
            
            
            for (EstadoCivil estadoCivil : lista) 
            {
                System.out.println(estadoCivil);
                
            }
            
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Responder(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Responder(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
