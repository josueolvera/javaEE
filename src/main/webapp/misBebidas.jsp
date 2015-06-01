<%-- 
    Document   : misBebidas
    Created on : May 28, 2015, 4:19:22 PM
    Author     : JOSUE
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Carta</title>
    </head>
    <body>
        <h1>La casa te Ofrece</h1>
        <table>
            <c:forEach items="${bebidas}" var="bebida">
                <tr>
                    <td>${bebida.nombre}</td>
                    <td>${bebida.tipo}</td>
                </tr>
                
            </c:forEach>
        </table>
    </body>
</html>
