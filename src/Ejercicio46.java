import javax.swing.*;
public class Ejercicio46 {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Introduzca primer valor");
        int a = Integer.parseInt(text);
        String texto = JOptionPane.showInputDialog("Introduzca segundo valor");
        int b = Integer.parseInt(texto);
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        int dif = (a - b);
        int inc = 0;

        if (dif%2 == 0) {
            inc = 2;
        } else {
            inc = 1;
        }
        for (int i = b; i >= a; i -= inc) {
            System.out.println(i + " ");
        }
    }
}
