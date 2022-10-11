import javax.swing.*;
public class Figura1 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Introduzca un valor");
        int altura = Integer.parseInt(texto);
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (altura * 2 - (i+1) * 2); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}