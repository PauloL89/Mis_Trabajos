
package SERVLET;


import GESTORES.GestorArticulos;
import MODELO.Articulo;
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
@WebServlet(name = "BajadeArticulo", urlPatterns = {"/BajadeArticulo"})
public class BajadeArticulo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        else if(modo.equals("eliminar"))
        {
            int idArticulo = Integer.parseInt(request.getParameter("id"));
            
            Articulo articulo = gestor.obtenerArticuloPorId(idArticulo);
            
            request.setAttribute("modeloArticulo", articulo);
            
           
            RequestDispatcher rd = request.getRequestDispatcher("VistasArticulos/BajadeArticulo.jsp");
            rd.forward(request, response);
            
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        int idArticulo = Integer.parseInt(request.getParameter("idArticulo")); // capturamos el id a actualizar
        
        GestorArticulos gestor = new GestorArticulos();
        Articulo articulo = gestor.obtenerArticuloPorId(idArticulo);
        
        gestor.eliminarArticulo(articulo.getIdArticulo());
        
        request.setAttribute("ListadoArticulo", gestor.consultarArticulos());
        RequestDispatcher rd = request.getRequestDispatcher("VistasArticulos/ListadoArticulosEdicion.jsp");
        rd.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
