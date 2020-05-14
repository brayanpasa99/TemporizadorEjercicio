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
        <link rel="stylesheet" href="estiloLogin.css"/>
        <title>Login</title>
    </head>
    <body>
        <form action="validaDatos">

            <center>

                <article id="todo">

                    <article id="art1">

                        <center>
                            <p>Every minute on the minute</p>
                        </center>

                    </article>

                    <article id="art2">

                        <center>
                            <h3>Login</h3>
                        </center>

                    </article>

                    <h1>Usuario:  &nbsp &nbsp &nbsp &nbsp &nbsp<input type="text" id="user" name="user" placeholder="Usuario"></h1>
                    <h1>Contraseña: &nbsp &nbsp &nbsp<input type="password" id="password" name="password" placeholder="Contraseña"></h1>   

                    <article id="artBoton">

                        <input type="submit" value="Ingresar" id="boton">
                        <input type="button" value="Registrar" id="boton" onclick="location.href='../TemporizadorWeb/registrarUsuario.jsp'">

                    </article>

                </article>

            </center>

        </form>
    </body>
</html>
