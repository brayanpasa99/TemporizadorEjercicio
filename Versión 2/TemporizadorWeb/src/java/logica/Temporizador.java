/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.swing.JTextArea;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author win7
 */
public class Temporizador {

    private int hora = 0;
    private int minutosEjercicio = 2;
    private int segundo = 5;
    private int segundoDescanso = 30;
    private Timer tiempo;
    private boolean corriendo;
    JTextArea estado;
    JTextArea temporizador_total;

    public String getFullHour() {
        return fullHour;
    }

    public void setFullHour(String fullHour) {
        this.fullHour = fullHour;
    }
    String fullHour = "";
    
    
    public Temporizador(){
        tiempo = new Timer();

    }

    public void ReproducirSonido(String nombreSonido) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }

    public int getMinutosEjercicio() {
        return minutosEjercicio;
    }

    public void setMinutosEjercicio(int minutosEjercicio) {
        this.minutosEjercicio = minutosEjercicio;
    }

    public int getSegundoDescanso() {
        return segundoDescanso;
    }

    public void setSegundoDescanso(int segundoDescanso) {
        this.segundoDescanso = segundoDescanso;
    }

    public void asignaTextArea(JTextArea estado, JTextArea t_total) {
        this.estado = estado;
        temporizador_total = t_total;
    }

    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            corriendo = true;
            if (segundo > 0) {
                if (segundo == segundoDescanso) {
                    estado.setText("Descansando");
                    ReproducirSonido("../beep-07.wav");
                }
                segundo--;
            } else {
                segundo = 59;
                estado.setText("Ejercicitando");
                ReproducirSonido("../beep-07.wav");
                if (minutosEjercicio > 0) {
                    minutosEjercicio--;
                } else {
                    minutosEjercicio = 59;
                    if (hora > 0) {
                        hora--;
                    } // si segundo = 0, minuto = 0 y hora = 0,
                    // cancelamos el timer
                    else {
                        corriendo = false;
                        tiempo.cancel();
                        tiempo.purge();
                    }
                }
            }
            if (corriendo) {
                

                fullHour += (hora > 9) ? ":" + hora : "0" + hora;
                fullHour += (minutosEjercicio > 9) ? ":" + minutosEjercicio : ":0" + minutosEjercicio;
                fullHour += (segundo > 9) ? ":" + segundo : ":0" + segundo;

                temporizador_total.setText(fullHour);
            }

        }
    };

    public void start(int delay, int intervalo) {
        tiempo.schedule(task, delay, intervalo);
    }

}
