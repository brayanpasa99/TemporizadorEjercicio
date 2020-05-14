<%-- 
    Document   : temporizador
    Created on : 13/05/2020, 09:12:24 PM
    Author     : danbr
--%>

<%@page import="Logica.temporizadorLogica"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% temporizadorLogica u = (temporizadorLogica) session.getAttribute("temporizador");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estiloTemporizador.css"/>
        <script>
            var h = <%= u.getHora()%>;
            var m = <%= u.getMinutosEjercicio()%>;
            var s = 5;
            var descanso = <%= u.getSegundoDescanso()%>;
            var actividad = false;
            var interval;
//contador_regresivo() // 0 Dias 0 Horas 1 Minuto 20 Segundos

            function contador_regresivo() {

                /*h = document.getElementById("hora")[0].value;
                 descanso = document.getElementById("segdesc")[0].value;
                 m = document.getElementById("minejer")[0].value*/

                interval = setInterval(function () {
                    setInter();
                    innerHTML();
                    // document.body.innerHTML = h+" h "+m+" m "+s+" s";
                }, 1000);
            }

            function setInter() {

                if (s > 0 && s <= 60) {
                    s--;
                    if (s === 0) {
                        actividad = true;
                    } else if (s === descanso) {
                        actividad = false;
                    }
                } else if (m > 0 && m <= 60) {
                    m--;
                    s = 59;
                } else if (h > 0) {
                    h--;
                    m = 59;
                    s = 59;
                } else {
                    h = 0;
                    m = 0;
                    s = 0;
                    clearInterval(interval);
                    alert("Ejercicio Finalizado");
                }
            }

            function innerHTML() {
                document.getElementById("tiempo").innerHTML = h + ":" + m + ":" + s;
                if (actividad === true) {
                    document.getElementById("estado").innerHTML = "Ejercitando";
                } else {
                    document.getElementById("estado").innerHTML = "Descansando";
                }
            }

            /*$(document).ready(function () {
             h = document.getElementById("hora")[0].value;
             descanso = document.getElementById("segdesc")[0].value;
             m = document.getElementById("minejer")[0].value;
             
             interval = setInterval(function () {
             setInter();
             innerHTML();
             // document.body.innerHTML = h+" h "+m+" m "+s+" s";
             }, 1000);
             });*/
        </script>
        <title>Temporizador</title>
    </head>
    <body onload="contador_regresivo()">
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
                            <h3>Temporizador</h3>
                        </center>

                    </article>

                    <input type="hidden" id="hora" value="<%= u.getHora()%>">
                    <input type="hidden" id="segdesc" value="<%= u.getSegundoDescanso()%><%= u.getMinutosEjercicio()%>">
                    <input type="hidden" id="minejer" value="<%= u.getMinutosEjercicio()%>">

                    <h1>Temporizador total: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <p id="tiempo"></p></h1>

                    <h1>Estado: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp <p id="estado"></p></h1>

                    <article id="artBoton">
                        <input type="submit" value="Regresar" id="boton">

                    </article>

                </article>

            </center>

        </form>
    </body>
</html>

