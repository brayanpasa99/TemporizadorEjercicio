
package temporizadoraplicacion;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InterfazGrafica extends JFrame implements ActionListener{

    private JLabel label  = new JLabel("Minutos del entrenamiento");
    private JLabel label2 = new JLabel("Tiempo de ejercicio (Min)");
    private JLabel label3 = new JLabel("Tiempo de descanso (Min)");
    private JLabel label4 = new JLabel("Temporizador Total: ");
    private JLabel label5 = new JLabel("Temporizador temporal: ");
    private JLabel label6 = new JLabel("Estado: ");
    
    private JTextField tf1 = new JTextField();
    private JTextField tf2 = new JTextField();
    private JTextField tf3 = new JTextField();
    
    private JTextArea ta1 = new JTextArea();
    private JTextArea ta2 = new JTextArea();
    private JTextArea ta3 = new JTextArea();
    
    private JButton b1 = new JButton("Ingresar tiempos");
    
    public InterfazGrafica (){
        
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle("App temporizador");
        this.setBounds(100, 100, 900, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
    
        c.add(label);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        c.add(label5);
        c.add(label6);
        
        c.add(b1);
        
        c.add(tf1);
        c.add(tf2);
        c.add(tf3);
        
        c.add(ta1);
        c.add(ta2);
        c.add(ta3);
        
        label.setBounds(30,20,200,20);
        label2.setBounds(330,20,200,20);
        label3.setBounds(630,20,200,20);
        label4.setBounds(100,120,200,20);
        label5.setBounds(100,200,200,20);
        label6.setBounds(500,165,200,20);
        
        b1.setBounds(50, 50, 800, 20);
        b1.addActionListener(this);
        
        tf1.setBounds(200, 20, 50, 20);
        tf2.setBounds(500, 20, 50, 20);
        tf3.setBounds(800, 20, 50, 20);
        
        ta1.setBounds(250, 100, 200, 60);
        ta2.setBounds(250, 180, 200, 60);
        ta3.setBounds(550, 145, 200, 60);
    }
    
    void llenarJFrame(){
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1){
            
            int minutos_entrenamiento = Integer.parseInt(tf1.getText());
            int tiempo_ejercicio = Integer.parseInt(tf2.getText());
            int tiempo_descanso = Integer.parseInt(tf3.getText());
        
            System.out.println(minutos_entrenamiento + " " + tiempo_ejercicio + " " + tiempo_descanso);
            
        }
    
    }
    
}
