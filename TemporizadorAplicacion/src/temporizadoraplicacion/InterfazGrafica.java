/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizadoraplicacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author braya
 */
public class InterfazGrafica extends JFrame implements ActionListener{

    public InterfazGrafica (){
        
        JFrame ventanamain = new JFrame();
        ventanamain.setVisible(true);
        ventanamain.setLayout(null);
        ventanamain.setBounds(100, 100, 500, 500);
        ventanamain.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        System.out.println("Esta es la branch interfaz :3");
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
