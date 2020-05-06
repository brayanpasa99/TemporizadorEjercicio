/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizadoraplicacion;

/**
 *
 * @author braya
 */
public class ValidacionDatos {

    //Creación de las variables sobre las cuales se va a realizar la validación de los datos.
    int tiempo_total;
    int tiempo_descanso;
    int tiempo_ejercicio;

    public ValidacionDatos() {

    }

    public void set_tiempo_total(int tiempo_total) {
        this.tiempo_total = tiempo_total;
    }

    public void set_tiempo_descanso(int tiempo_descanso) {
        this.tiempo_descanso = tiempo_descanso;
    }

    public void get_tiempo_total(int tiempo_ejercicio) {
        this.tiempo_ejercicio = tiempo_ejercicio;
    }

    public boolean valida_minuto() {

        return (tiempo_descanso + tiempo_ejercicio) == 60;
    }
}
