<%-- 
    Document   : temporizador
    Created on : 13/05/2020, 07:29:37 PM
    Author     : danbr
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estiloTiempos.css"/>
        <title>Temporizador</title>
    </head>
    <body>
        
        <form action="temporizador.jsp">
           
            <center>
            
                <article id="todo">

                        <article id="art1">

                            <center>
                            <p>Every minute on the minute</p>
                            </center>

                        </article>

                        <article id="art2">

                            <center>
                            <h3>Ingreso de tiempos</h3>
                            </center>

                        </article>

                    <h1>Minutos de entrenamiento: &nbsp &nbsp &nbsp<input type="number" id="minEbn" name="minEbn"></h1>
                    <h1>Tiempo de ejercicio (SEG): &nbsp &nbsp &nbsp<input type="number" id="ejercicio" name="ejercicio"></h1>   
                    <h1>Tiempo de descanso (SEG): &nbsp &nbsp &nbsp<input type="number" id="descando" name="descando"></h1>   
                    
                    <article id="artBoton">
                    
                        <input type="submit" value="Ingresar Tiempos" id="boton"> 
                    
                    </article>
                    
                </article>
                
            </center>
            
        </form>
        
            <center>
        
                <article id="artConsulta">
            
                    <form action="consultaUsuario.jsp">

                        <input type="submit" value="Cosultar registros pasados" id="botonConsulta">

                    </form>
        
                </article>
                
            </center>
             
        </form>
        
    </body>
</html>

