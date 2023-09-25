import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class Ejercicio_2 extends JFrame implements ActionListener{
    private JLabel label_uno;
    private JButton boton1;
    private JTextField textfield1;
    //Esto sirve para capturar el evento

    public Ejercicio_2(){
        setTitle("M07 Videotutoría 2 - UF1");
        setSize(400, 300);
        setLocation(10, 20);

        // Establecer el color de fondo
        getContentPane().setBackground(new Color(0x99CCFF)); // 0x99CCFF representa el color #99CCFF

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Establecer el diseño en null para colocar los componentes manualmente

        label_uno = new JLabel("Escribe tu nombre:");
        label_uno.setBounds(50,30,150,50);
        add(label_uno);

        textfield1 = new JTextField();
        textfield1.setBounds(50,90,150,30);
        add(textfield1);

        boton1 = new JButton("OK");
        boton1.setBounds(50,150,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            String inputText = textfield1.getText();
            String message = "Hola " + inputText;
            JOptionPane.showMessageDialog(this, message, "Saludo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String args[]){
        Ejercicio_2 ejercicio2 = new Ejercicio_2();
        ejercicio2.setVisible(true);

    }
}

