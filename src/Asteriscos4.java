import javax.swing.*;
public class Asteriscos4 {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Introduce fila");
        int f = Integer.parseInt(text); //asigna valor por teclado
        String texto = JOptionPane.showInputDialog("Introduce columna");
        int c = Integer.parseInt(texto); //asigna valor por teclado

        for (int cont = 1; cont <= f; cont++) {
            System.out.println(); //hace salto de linea
         for (int conta = 1; conta <= c; conta++) {
             System.out.print("*"); //escribe en columnas
         }
         }

    }
}