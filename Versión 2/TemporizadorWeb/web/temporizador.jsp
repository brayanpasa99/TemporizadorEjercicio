<%-- 
    Document   : temporizador
    Created on : 13/05/2020, 09:12:24 PM
    Author     : danbr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estiloTemporizador.css"/>
        <title>Temporizador</title>
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
                            <h3>Temporizador</h3>
                            </center>

                        </article>

                    <h1>Temporizador total: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <textarea name="comentarios" rows="1" cols="25" placeholder="Aqui va el tiempo"></textarea></h1>
                        
                    <h1>Estado: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp <textarea name="comentarios" rows="2" cols="25" placeholder="Aqui va el estado actual"></textarea></h1>
                        
                    <article id="artBoton">
                    
                        <input type="submit" value="Regresar" id="boton">

                    </article>
                    
                </article>
                
            </center>
             
        </form>
    </body>
</html>

