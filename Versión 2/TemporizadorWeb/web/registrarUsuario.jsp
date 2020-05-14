<%-- 
    Document   : registrarUsuario
    Created on : 11/05/2020, 11:15:55 PM
    Author     : braya
--%>

<%@page import="Logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar usuario</title>
    </head>
    <body>
        <form action="registrarUsuarioServlet">
            <h1>Registrar usuario</h1>
            <p>Se ha redirigido a la página de registro, por favor ingrese los datos del usuario que desea registrar</p>
            <h1>Usuario: <input type="text" id="user" name="user" required=""></h1>
            <h1>Nombre: <input type="text" id="nameu" name="nameu" required=""></h1>
            <h1>Apellido: <input type="text" id="lastnameu" name="lastnameu" required=""></h1>
            <h1>Edad: <input type="text" id="age" name="age" required=""></h1>
            <h1>Contraseña: <input type="password" id="password" name="password" required=""></h1> 
            <h1>Verifique la contraseña: <input type="password" id="password" name="password" required=""></h1>
            <input type="submit" value="Registrar">
        </form>
    </body>
</html>
