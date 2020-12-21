<%-- 
    Document   : ListadoPersonas
    Created on : 9 oct. 2020, 15:08:40
--%>

<%@page import="modelo.Persona"%>
<%@page import="java.util.ArrayList"%>
<%@page import="gestores.GestorPersonas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LISTADO DE PERSONAS</h1>
        <table border ="1">
            <%
                ArrayList<Persona> lista = (ArrayList<Persona>) request.getAttribute("lista");
                for(Persona persona: lista)
                {
                    out.print("<tr> <td>" + persona.getNombre() 
                    + "</td><td>"+ persona.getApellido()
                    + "</td><td>"+ persona.getEstadoCivil()
                    + "</td></tr>");
                }
                
            %>
            
        </table>
    </body>
</html>
