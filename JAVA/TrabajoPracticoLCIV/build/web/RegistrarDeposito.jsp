<%-- 
    Document   : RegistrarDeposito
    Created on : 01-nov-2020, 19:27:23
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
                <%@ include file="/MenuAdmin.jsp" %>
                <div class="container">
                    <h1>Registrar Nuevo Deposito</h1>

                    <form action="AltaDeposito" method="post" onsubmit="return validadDeposito();">
                        <input type="hidden" name="idPareja" value="${modeloDeposito.idPareja}" />
                        <div class="form-group">
                            <label>Primer Conyuge: </label>
                            <input name="txtPrimerConyuge" value="${modeloDeposito.primerConyuge}" readonly class="form-control"/>
                        </div>

                        <div class="form-group">
                            <label>Segundo Conyuge: </label>
                            <input name="txtSegundoConyuge" value="${modeloDeposito.segundoConyuge}" readonly class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label>Nombre Invitado: </label>
                            <input name="txtNombreInvitado"  class="form-control" required/>
                        </div>

                        <div class="form-group">
                            <label>Apellido Invitado: </label>
                            <input name="txtApellidoInvitado" class="form-control" required/>
                        </div>
                        <div class="form-group">
                            <label>Telefono Invitado: </label>
                            <input name="txtTelefonoInvitado" class="form-control" required/>
                        </div>
                        <div class="form-group">
                            <label>Monto a Depositar </label>
                            <input type="number" min="1" max="100000000" name="txtMonto" class="form-control" required/>
                        </div>


                        <input type="submit" value="Registrar" class="btn-primary"/>
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
