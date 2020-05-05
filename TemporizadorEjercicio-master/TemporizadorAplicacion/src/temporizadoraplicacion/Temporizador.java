/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizadoraplicacion;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author win7
 */
public class Temporizador {
    
    private int hora = 0;
    private int minutosEjercicio = 2;
    private int segundo = 5;
    private int segundoDescanso=30;
    private Timer tiempo;
    private boolean corriendo;
    
 
    public Temporizador() {
        tiempo = new Timer();
        
    }
    
 
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            corriendo = true;
            if(segundo > 0 ) {
                if (segundo==segundoDescanso)
                    System.out.println("descanso");
                segundo--;
            } else {
                segundo = 59;
                System.out.println("retomar ejercicio");
                if(minutosEjercicio > 0) 
                    minutosEjercicio--;
                else {
                    minutosEjercicio = 59;
                    if(hora > 0) hora--;
                    // si segundo = 0, minuto = 0 y hora = 0,
                    // cancelamos el timer
                    else {
                        corriendo = false;
                        tiempo.cancel();
                        tiempo.purge();
                    }
                }
            }
            if(corriendo){
            String fullHour = "";
 
            fullHour += (hora > 9) ? ":" + hora : "0" + hora;
            fullHour += (minutosEjercicio > 9) ? ":" + minutosEjercicio : ":0" + minutosEjercicio;
            fullHour += (segundo > 9) ? ":" + segundo : ":0" + segundo;

            System.out.println(fullHour);
            }
            
            }
    }; 
 
    public void start(int delay, int intervalo) {
        tiempo.schedule(task, delay, intervalo);
    }
 
}