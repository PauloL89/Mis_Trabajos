<%-- 
    Document   : ModificarPareja
    Created on : 28-oct-2020, 11:51:25
    Author     : Paulo_PC
--%>

<%@page import="MODELO.Pareja"%>
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
                <%@ include file="/MenuAdmin.jsp" %>

                <div>
                    <h1>Modificar datos de la Pareja</h1>
                    <form action="ModificarPareja" method="post" onsubmit="return validarAltaPareja();">
                        <input type="hidden" name="idPareja" value="${modeloPareja.idPareja}" />

                        <div class="form-group">
                            <label>Primer Conyuge: </label>
                            <input name="primerConyuge" value ="${modeloPareja.primerConyuge}" class="form-control" required/>
                        </div>

                        <div class="form-group">
                            <label>Segundo Conyuge: </label>
                            <input name="segundoConyuge" value="${modeloPareja.segundoConyuge}" class="form-control" required/>
                        </div>

                        <div class="form-group">
                            <label>Telefono: </label>
                            <input name="telefono" value="${modeloPareja.telefono}" class="form-control" required/>
                        </div>

                        <div class="form-group">
                            <label>Domicilio: </label>
                            <input name="domicilio" value="${modeloPareja.domicilio}" class="form-control" required/>
                        </div>

                        <div class="form-group">
                            <label>Ciudad: </label>
                            <input name="ciudad" value="${modeloPareja.ciudad}" class="form-control" required/>
                        </div>

                        <div class="form-group">
                            <label>Provincia: </label>
                            <select name="provincia" class="form-control">
                                <c:forEach items ="${listadoProvincia}" var="item">
                                    <option value="${item.idProvincia}" <c:if test="${ item.provincia == modeloPareja.provincia.provincia}">selected</c:if> >
                                        ${item.provincia}
                                    </option>
                                </c:forEach>
                            </select>
                        </div>
                        <input type="submit" value="Modificar" class="btn btn-primary"/>
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
