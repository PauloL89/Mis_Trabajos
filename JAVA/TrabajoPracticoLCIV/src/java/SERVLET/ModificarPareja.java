
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
@WebServlet(name = "ModificarPareja", urlPatterns = {"/ModificarPareja"})
public class ModificarPareja extends HttpServlet 
{

   
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
        else if(modo.equals("editar"))
        {
            
            int idPareja = Integer.parseInt(request.getParameter("id")); // capturamos el id a actualizar
            
            Pareja pareja = gestor.obtenerParejaPorId(idPareja);
            
            request.setAttribute("modeloPareja", pareja); // crea el atributo modeloPareja
            
            CargarCombo combo = new CargarCombo();
            ArrayList<Provincia> lista = combo.obtenerProvincia();
        
            request.setAttribute("listadoProvincia", lista);
            RequestDispatcher rd = request.getRequestDispatcher("VistasParejas/ModificarPareja.jsp");
            rd.forward(request, response);
            
            
        }
        
        
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String idPareja = request.getParameter("idPareja");
        GestorParejas gestor = new GestorParejas();
        
        String primerConyuge = request.getParameter("primerConyuge");
        String segundoConyuge = request.getParameter("segundoConyuge");
        String telefono = request.getParameter("telefono");
        String domicilio = request.getParameter("domicilio");
        String ciudad = request.getParameter("ciudad");
        String prov = request.getParameter("provincia");
        
        Provincia provincia = new Provincia();
        provincia.setIdProvincia(Integer.parseInt(prov));
        
        Pareja pareja = new Pareja(0, primerConyuge, segundoConyuge, telefono, domicilio, ciudad, provincia);
        
        pareja.setIdPareja(Integer.parseInt(idPareja));
        
        gestor.modificarPareja(pareja);
        
        
        request.setAttribute("ListadoParejas", gestor.consultarParejas());
        RequestDispatcher rd = request.getRequestDispatcher("VistasParejas/ListadoParejasEdicion.jsp");
        rd.forward(request, response);

    }

    

}
