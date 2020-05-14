/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author win7
 */
public class temporizadorLogica {

    private int hora = 0;
    private int minutosEjercicio = 2;
    private int segundoDescanso = 30;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
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

}
