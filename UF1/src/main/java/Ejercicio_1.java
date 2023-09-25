import javax.swing.*;
import java.awt.Color;
public class Ejercicio_1 extends JFrame {
    public static void main(String args[]){
            JFrame ventana = new JFrame("M07 Videotutoría 2 - UF1");
            // Establecer el tamaño de la ventana
            ventana.setSize(400, 300);
            // Establecer la posición (x, y) de la ventana
            ventana.setLocation(10, 20);
            // Establecer el color de fondo
            ventana.getContentPane().setBackground(new Color(0x99CCFF)); // 0x99CCFF representa el color #99CCFF
            // Hacer que la aplicación se cierre cuando se cierra la ventana
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             // Mostrar la ventana
            ventana.setVisible(true);
    }
}
