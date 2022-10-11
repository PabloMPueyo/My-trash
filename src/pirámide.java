import javax.swing.*;
public class pirámide {
    public static void main(String[] args) {
        int filas;
        boolean flag = false;
        do {
            String texto = JOptionPane.showInputDialog("Introduzca valor entre 3 y 21"); //crea un cuadro de diálogo
                filas = Integer.parseInt(texto); //asigna un valor por teclado
                if (filas < 3 || filas > 21) { //limita el número de líneas que se pueden introducir
                    JOptionPane.showMessageDialog(null, "El valor no es " + "correcto");
                } else {
                    flag = true;
                }
        } while (!flag); //repite comprobación

        for (int columnas = 1; columnas <= filas; columnas++) { //crea tantas columnas como filas
            for (int espacio = filas; espacio > columnas - 1; espacio--) { //rellena las columnas con espacios
                System.out.print(" ");
            }
            for (int astr = 0; astr < ((columnas * 2) - 1); astr++) {
                System.out.print("*");
            }
            System.out.println(); //saltos de línea
        }
    }
}