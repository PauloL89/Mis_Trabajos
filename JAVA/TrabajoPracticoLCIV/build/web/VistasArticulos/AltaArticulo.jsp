<%-- 
    Document   : AltaArticulo
    Created on : 30-oct-2020, 11:32:34
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
                    <form action="AltaArticulos" method="post" onsubmit="return validarAltaArticulo();">
                        <h1>Alta de Articulo</h1>

                        <div class="form-group">
                            <label>Articulo: </label>
                            <input type="text" name="txtArticulo" class="form-control" required/>
                        </div>

                        <div class="form-group">
                            <label>Precio Unitario: </label>
                            <input type="number" name="txtPrecio" class="form-control" required />
                        </div>

                        <input type="submit" value="Registrar" class="btn btn-primary" />

                    </form>
                </div>
            </c:when>
            <c:otherwise>
               <%@include file="/InfoError.jsp" %>
            </c:otherwise>
        </c:choose>

        
    </body>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</html>
