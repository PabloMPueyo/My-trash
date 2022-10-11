import javax.swing.*;
public class PirámideInvertida {
    public static void main(String[] args) {
        int filas;
        boolean flag = false;
        do { //crea el bucle para pedir valor correcto
            String texto = JOptionPane.showInputDialog("Introduce un valor del 3 al 21");
            filas = Integer.parseInt(texto);
            if (filas < 3 || filas > 21) {
                JOptionPane.showMessageDialog(null, "Valor incorrecto");
            } else {
                flag = true;
            }
        } while (!flag);

        for (int columnas = 0; columnas <= filas; columnas++) { //crea tantas columnas como filas
            for (int espacio = 0; espacio < columnas; espacio++) { //separa los asteriscos del lado izquierdo
                System.out.print(" ");
            }
            for (int astr = filas; astr > columnas; astr--) { //imprime asteriscos, el espacio es para centrarlos
                System.out.print("* ");
            }
            System.out.println(); //saltos de línea
        }
    }
}
