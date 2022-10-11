import javax.swing.*;
public class ejercicio47 {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Introduzca un valor");
        int a = Integer.parseInt(text);
        int c = 0;

        while (a > 0) {
            a = a / 10;
            c++;
        }
        System.out.println("El número tiene " + c + " cifras");
    }
}
