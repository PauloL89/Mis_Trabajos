<%-- 
    Document   : ListadoArticulosEdicion
    Created on : 30-oct-2020, 12:34:19
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
    <body background="https://www.flexxus.com.ar/wp-content/uploads/2016/03/software-de-gestion-erp-para-comercios-articulos-del-hogar.jpg">
        <c:choose>
            <c:when test="${not empty User}">
                <%@ include file="/MenuAdmin.jsp" %>

                <div class="container">
                    <h1>Lista de Articulos</h1>
                    <table border = "2" class="table table-dark">
                        <thead>
                            <tr>
                                <th scope="col">Articulo</th>
                                <th scope="col">Precio Unitario</th>
                                <th scope="col">Edicion</th>
                                <th scope="col">Baja</th>
                            </tr>

                        </thead>

                        <c:forEach items="${ListadoArticulo}" var="item">
                            <tbody>
                                <tr>
                                    <td>${item.articulo}</td>
                                    <td>$${item.precioUnitario}</td>
                                    <td><a href="ModificarArticulo?modo=editar&id=${item.idArticulo}" class="btn btn-primary">Modificar </a> </td>
                                    <td><a href="BajadeArticulo?modo=eliminar&id=${item.idArticulo}" class="btn btn-danger">Eliminar </a> </td>

                                </tr>
                            </tbody>

                        </c:forEach>

                    </table >
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
