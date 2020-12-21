
package SERVLET;

import GESTORES.GestorDepositos;
import GESTORES.GestorParejas;
import MODELO.Pareja;
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
@WebServlet(name = "ConsultarDepositos", urlPatterns = {"/ConsultarDepositos"})
public class ConsultarDepositos extends HttpServlet {

    
   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String modo = request.getParameter("modo");
        
        if(modo == null || modo.isEmpty())
        {
            RequestDispatcher rd = request.getRequestDispatcher("VistasArticulos/ListadoArticulosEdicion.jsp");
            rd.forward(request, response);
        }
        else if(modo.equals("consultar"))
        {
            int idPareja = Integer.parseInt(request.getParameter("id"));
            
            GestorParejas gestorPareja = new GestorParejas();
            Pareja pareja = gestorPareja.obtenerParejaPorId(idPareja);
            
            request.setAttribute("consulta", pareja);
            
            GestorDepositos gestor = new GestorDepositos();
           // gestor.consultarDeposito(idPareja);
           
           //Obtengo el total de depositos de la pareja seleccionada
           float saldo = gestor.consultarDeposito(idPareja);
           
           //Actualiza el saldo de la pareja en la bd
           gestor.actualizarSaldo(saldo, idPareja);
           pareja.setSaldo(saldo);
           
           request.setAttribute("monto", gestor);
           
            // Redirige al jsp consultar depositos
            RequestDispatcher rd = request.getRequestDispatcher("/ConsultarDepositos.jsp");
           rd.forward(request, response);
            
        }
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        
    }

    
}
