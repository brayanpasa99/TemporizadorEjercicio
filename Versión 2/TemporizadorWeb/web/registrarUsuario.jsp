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
        <link rel="stylesheet" href="estiloRegistro.css"/>
    </head>
    <body>
        <form action="registrarUsuarioServlet">
            
            <center>
            
                <article id="todo">

                    <article id="art1">

                        <center>
                            <p>Every minute on the minute</p>
                        </center>

                    </article>

                    <article id="artRegistro">

                        <center>
                            
                            <h1>Registrar usuario</h1>
                            <p>Se ha redirigido a la página de registro, por favor ingrese los datos del usuario que desea registrar</p>
                    
                        </center>

                    </article>
                    
                    <h1>Usuario: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<input type="text" id="user" name="user" required=""></h1>
                    <h1>Nombre: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<input type="text" id="nameu" name="nameu" required=""></h1>
                    <h1>Apellido: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<input type="text" id="lastnameu" name="lastnameu" required=""></h1>
                    <h1>Edad: &nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<input type="text" id="age" name="age" required=""></h1>
                    <h1>Contraseña: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<input type="password" id="password" name="password" required=""></h1> 
                    <h1>Verifique la contraseña: <input type="password" id="password" name="password" required=""></h1>
                    
                    <article id="artBoton">
                        
                        <input type="submit" value="Registrar" id="boton">
                    
                    </article>            

                </article>
            
            </center>
            
        </form>
    </body>
</html>
