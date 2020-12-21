
package SERVLET;

import GESTORES.GestorArticulos;
import MODELO.Articulo;
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
@WebServlet(name = "AltaArticulos", urlPatterns = {"/AltaArticulos"})
public class AltaArticulos extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        //request.setAttribute("listadoProvincia", lista);
        RequestDispatcher rd = request.getRequestDispatcher("VistasArticulos/AltaArticulo.jsp");
        rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        // Capturar los datos del formulario
        String nomArticulo = request.getParameter("txtArticulo");
        float precio = Float.parseFloat(request.getParameter("txtPrecio"));
        
        
       
        Articulo articulo = new Articulo(0, nomArticulo, precio);
        
        GestorArticulos gestor = new GestorArticulos();
        if(!articulo.equals("") && precio > 0 )
        {
            gestor.altaArticulo(articulo); 
        }
        else
        {
            RequestDispatcher rd = request.getRequestDispatcher("pantallaError.jsp");
            rd.forward(request, response);
        }
        
        
        //Redirigo a listado de pareja
        request.setAttribute("ListadoArticulo", gestor.consultarArticulos());
        RequestDispatcher rd = request.getRequestDispatcher("VistasArticulos/ListadoArticulosEdicion.jsp");
        rd.forward(request, response);
    }

   

}
