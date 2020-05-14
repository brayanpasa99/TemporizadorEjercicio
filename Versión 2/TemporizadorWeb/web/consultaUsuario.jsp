<%-- 
    Document   : consultaUsuario
    Created on : 13/05/2020, 09:48:20 PM
    Author     : danbr
--%>

<%@page import="DAO.BDrutinas"%>
<%@page import="Logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Persona u = (Persona) session.getAttribute("UnUsuario");%>
<% BDrutinas ru = new BDrutinas(); %>
<% String rutinas = ru.consulta_rutinas(u.getUsuario()); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estiloLogin.css"/>
        <script>
            function escribir(){
                document.getElementById('comentarios').value=<%=rutinas%>
            }
        </script>
        <title>Login</title>
    </head>
    <body onload="escribir()">
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

                    <h1>Nombre: <input type="text" value="<%=u.getNombre()%>" disabled=""></h1>
                    <h1>Apellido: <input type="text" value="<%=u.getApellido()%>" disabled=""></h1>   
                    <h1>Edad: <input type="text" value="<%=u.getEdad()%>" disabled=""></h1>
                    <h1>Rutinas de ejercicio</h1> 
                    
                    <textarea cols=50 rows=10 name="comentarios" id="comentarios"></textarea>
                    
                    <article id="artBoton">
                    
                        <input type="submit" value="Regresar" id="boton">

                    </article>
                    
                </article>
                
            </center>
             
        </form>
    </body>
</html>

