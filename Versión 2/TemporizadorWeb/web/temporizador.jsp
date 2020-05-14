<%-- 
    Document   : temporizador
    Created on : 13/05/2020, 07:29:37 PM
    Author     : danbr
--%>

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

                    <h1>Minutos de entrenamiento: &nbsp &nbsp &nbsp<input type="number" id="minEbn" name="minEbn"></h1>
                    <h1>Tiempo de ejercicio (SEG): &nbsp &nbsp &nbsp<input type="number" id="ejercicio" name="ejercicio"></h1>   
                    <h1>Tiempo de descanso (SEG): &nbsp &nbsp &nbsp<input type="number" id="descando" name="descando"></h1>   
                    
                    <article id="artBoton">
                    
                        <input type="submit" value="Ingresar Tiempos" id="boton">

                    </article>
                    
                    <article id="artTextArea">
                        
                        <h1>Temporizador total: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <textarea name="comentarios" rows="1" cols="25">Aqui va el temp</textarea></h1>
                        
                        <h1>Estado: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp <textarea name="comentarios" rows="2" cols="25">Aqui va el Estado</textarea></h1>
                        
                    </article>
                    
                </article>
                
            </center>
             
        </form>
    </body>
</html>

