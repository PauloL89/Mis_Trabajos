<%-- 
    Document   : ListadoParejas
    Created on : 27-oct-2020, 14:52:18
    Author     : Paulo_PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    </head>
    <body background="https://i.pinimg.com/originals/62/d4/60/62d460889f4c79dcba105e9d420f52e5.jpg">
        <%@ include file="/Inicio.jsp" %>
        <div class="container">
            
            <h1>Listado de Parejas</h1>
        
            <table border = "2" class="table table-dark">
                <thead>
                    <th scope="col">Primer Conyuge</th>
                    <th scope="col">Segundo Conyuge</th>
                    <th scope="col">Telefono</th>
                    <th scope="col">Domicilio</th>
                    <th scope="col">Ciudad</th>
                    <th scope="col">Provincia</th>
                </thead>
                <c:forEach items="${ ListadoParejas}" var="item">
                    <tbody
                        <tr>
                            <td>${item.primerConyuge}</td>
                            <td>${item.segundoConyuge}</td>
                            <td>${item.telefono}</td>
                            <td>${item.domicilio}</td>
                            <td>${item.ciudad}</td>
                            <td>${item.provincia}</td>

                        </tr>
                    </tbody>    
                </c:forEach>

            </table>
            
        </div>
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </body>
</html>
