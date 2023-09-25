import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class Ejercicio_3_1 extends JFrame implements ActionListener{
    private JLabel label_uno;
    private JLabel label_dos;
    private JLabel label_tres;
    private JButton boton1;
    private JTextField textfield1;
    private JTextField textfield2;

    public Ejercicio_3_1(){
        setTitle("M07 Videotutoría 3 - UF1");
        setSize(400, 300);
        setLocation(10, 20);

        // Establecer el color de fondo
        getContentPane().setBackground(new Color(0x99CCFF)); // 0x99CCFF representa el color #99CCFF

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Establecer el diseño en null para colocar los componentes manualmente

        label_uno = new JLabel("M07 - UF1 - VT3 - Formulario");
        label_uno.setBounds(5,10,390,70);
        add(label_uno);
        label_dos = new JLabel("Nombre:");
        label_dos.setBounds(50,60,60,50);
        add(label_dos);
        label_tres = new JLabel("Apellidos:");
        label_tres.setBounds(50,95,60,50);
        add(label_tres);

        textfield1 = new JTextField();
        textfield1.setBounds(150,75,220,20);
        add(textfield1);
        textfield2 = new JTextField();
        textfield2.setBounds(150,110,220,20);
        add(textfield2);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(150,150,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            String inputText = textfield1.getText();
            String inputText2 = textfield2.getText();
            String message = "Bienvenid@ " + inputText +" " + inputText2;
            JOptionPane.showMessageDialog(this, message, "Saludo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String args[]){
        Ejercicio_3_1 ejercicio3 = new Ejercicio_3_1();
        ejercicio3.setVisible(true);

    }
}



