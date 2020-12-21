<%-- 
    Document   : RegistrarCompra
    Created on : 02-nov-2020, 20:03:14
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
                    <h1>Registrar Compra</h1>

                    <form action="RegistrarCompra" method="post">
                        <input type="hidden" name="idPareja" value="${modeloPareja.idPareja}" />
                        <div class="form-group">
                            <label>Primer Conyuge: </label>
                            <label class="form-control"> ${modeloPareja.primerConyuge}</label>
                        </div>

                        <div class="form-group">
                            <label>Segundo Conyuge: </label>
                            <label class="form-control"> ${modeloPareja.segundoConyuge}</label>
                        </div>

                        <div class="form-group">
                            <label>Saldo de la Pareja: </label>
                            <label class="form-control"> $${modeloDeposito.consultarDeposito(modeloPareja.idPareja)}</label>
                        </div>
                        <div class="form-group">
                            <label>Articulos: </label>
                            <select name="cmbArticulo" class="form-control">
                                <c:forEach items ="${listadoArticulos}" var="item">
                                    <option value="${item.idArticulo}">
                                        ${item.articulo} - $${item.precioUnitario} 
                                    </option>
                                </c:forEach>
                            </select>
                        </div>
                        <input type="submit" value="Confirmar Compra" class="btn btn-success" /> 
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
