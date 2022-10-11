import javax.swing.*;
public class ejercicio46II {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Introduzca primer valor");
        int a = Integer.parseInt(text);
        String texto = JOptionPane.showInputDialog("Introduzca segundo valor");
        int b = Integer.parseInt(texto);
        String tex = JOptionPane.showInputDialog("Introduzca último valor");
        int c = Integer.parseInt(tex);

        if (a > b) {
            int aux = a; a = b; b = aux;
        }
        if (b > c) {
            int aux = b; b= c; c = aux;
        }
        if (a > b) {
            int aux = a; a = b; b = aux;
        }
    }
}
