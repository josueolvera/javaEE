<%-- 
    Document   : antro
    Created on : 26/05/2015, 09:42:20 PM
    Author     : T-107
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Elije</title>
    </head>
    <body>
        <form action="bebida.php" method="GET">
            Elije una bebida:<br>
            <select name="bebida">
                <option value="cerveza">Cerveza</option>
                <option value="brandy">Brandy</option>
                <option value="tequila">Tequila</option>
                <option value="whisky">Whisky</option>
            </select>
            <input type="submit" value="seleccionar">
            
        </form>
    </body>
</html>
