<%-- 
    Document   : ReporteListadoParejasRegistradas
    Created on : 06-nov-2020, 20:06:38
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
        <c:choose>
            <c:when test="${not empty User}">
                <div class="container">
                    <%@ include file="/MenuAdmin.jsp" %>
                    <h1>Reporte de Listado de Parejas Registradas</h1>

                    <table border = "2" class="table table-dark">
                        <thead>
                        <th scope="col">Primer Conyuge</th>
                        <th scope="col">Segundo Conyuge</th>
                        <th scope="col">Cantidad de Depositos</th>
                        <th scope="col">Suma Total de Depositos</th>
                        </thead>
                        <c:forEach items="${ ListadoParejas}" var="item">
                            <tbody
                                <tr>
                                    <td>${item.primerConyuge}</td>
                                    <td>${item.segundoConyuge}</td>
                                    <td>${item.cantidad}</td>
                                    <td>$${item.totalDepositos}</td>

                                </tr>
                            </tbody>    
                        </c:forEach>

                    </table>

                </div>
            </c:when>
            <c:otherwise>
                <%@include file="/InfoError.jsp" %>
            </c:otherwise>
        </c:choose>


        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

    </body>
</html>
