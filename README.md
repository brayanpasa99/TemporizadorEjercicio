# TemporizadorEjercicio
Temporizador de dos versiones, el temporizador será configurado con un tiempo determinado para una rutina de ejercicio, también se hará la configuración del tiempo de ejercicio por cada minuto y el tiempo de descanso por cada minuto.

# Integrantes

* Brayan Alexander Paredes Sánchez - 20171020106
* Omar Alejandro Espitia Sánchez - 20171020094
* Daniel Alejandro Roa Palacios - 20171020077

# Experiencia versión 1

* Surge cierta inquietud sobre como generar la división del trabajo para realizar tareas de forma simultánea
* Se eliminan clases creadas que finalmente no fueron necesarias
* Hubo un problema por modificar la rama interfaz de manera simultánea con un compañero, se tuvo que devolver a una versión anterior de la rama

# Versión 2

Tuvimos un problema con el merge de las ramas finales al máster así que todo se encuentra en la rama "CombinaInterfaz". El componente más pensado para el reuso es el que está dedicado a la gestión de la base de datos y la gestión de usuarios. Eso lo podemos afirmar debido a que dedicamos un paquete único para el patrón DAO que se encarga de la gestión de base de datos, agregamos clases con tareas específicas como validación y registro que recibían datos de procesos previamente realizados por un servlet en su mayoría de casos lo que facilitaba la transmisión de información.

Habría que hacer modificaciones mínimas al componente del temporizador para tenerlo completamente listo para el reuso.
