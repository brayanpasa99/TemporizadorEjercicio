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
public class TemporizadorAplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Temporizador t = new Temporizador();
        t.setMinutosEjercicio(20);
        t.setSegundoDescanso(30);
        t.start(0, 1000);
        InterfazGrafica iniciar = new InterfazGrafica();
        
    }
    
}
