<%-- 
    Document   : index
    Created on : 6/05/2020, 10:57:29 PM
    Author     : braya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="validaDatos">
            <h1>Usuario: <input type="text" id="user" name="user"></h1>
            <h1>Contraseña: <input type="password" id="password" name="password"></h1>   
            <input type="submit" value="Ingresar">
        </form>
    </body>
</html>
