<%-- 
    Document   : consultaUsuario
    Created on : 13/05/2020, 09:48:20 PM
    Author     : danbr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estiloLogin.css"/>
        <title>Consulta Usuario</title>
    </head>
    <body>
        <form action="tiempos.jsp">
           
            <center>
            
                <article id="todo">

                        <article id="art1">

                            <center>
                            <p>Every minute on the minute</p>
                            </center>

                        </article>

                        <article id="art2">

                            <center>
                            <h3>Datos del usuario</h3>
                            </center>

                        </article>

                    <h1>Nombre: Pepe</h1>
                    <h1>Apellido: Gomez</h1>   
                    <h1>Edad: 47</h1>
                    <h1>Rutinas de ejercicio</h1> 
                    
                    <textarea name="comentarios" rows="10" cols="45">Rutina de ejercicio epica</textarea>
                    
                    <article id="artBoton">
                    
                        <input type="submit" value="Regresar" id="boton">

                    </article>
                    
                </article>
                
            </center>
             
        </form>
    </body>
</html>

