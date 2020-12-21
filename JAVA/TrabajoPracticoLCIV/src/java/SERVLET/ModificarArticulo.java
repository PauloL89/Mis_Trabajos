
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
@WebServlet(name = "ModificarArticulo", urlPatterns = {"/ModificarArticulo"})
public class ModificarArticulo extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
         GestorArticulos gestor = new GestorArticulos();
        String modo = request.getParameter("modo");
        
        if(modo == null || modo.isEmpty())
        {

            RequestDispatcher rd = request.getRequestDispatcher("VistasArticulos/ListadoArticulosEdicion.jsp");
            rd.forward(request, response);
        }
        else if(modo.equals("editar"))
        {
            
            int idArticulo = Integer.parseInt(request.getParameter("id")); // capturamos el id a actualizar
            
            Articulo articulo = gestor.obtenerArticuloPorId(idArticulo);
            
            request.setAttribute("modeloArticulo", articulo); // crea el atributo modeloArtiulo
            
            
            RequestDispatcher rd = request.getRequestDispatcher("VistasArticulos/ModificarArticulo.jsp");
            rd.forward(request, response);
            
            
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String idArticulo = request.getParameter("idArticulo");
        GestorArticulos gestor = new GestorArticulos();
        
        String nomArticulo = request.getParameter("articulo");
        float precio = Float.parseFloat(request.getParameter("precioUnitario"));
        
        
       
        
        Articulo articulo = new Articulo(0, nomArticulo,precio);
        
        articulo.setIdArticulo(Integer.parseInt(idArticulo));
        
        gestor.modificarArticulo(articulo);
        
        
        request.setAttribute("ListadoArticulo", gestor.consultarArticulos());
        RequestDispatcher rd = request.getRequestDispatcher("VistasArticulos/ListadoArticulosEdicion.jsp");
        rd.forward(request, response);
    }

   

}
