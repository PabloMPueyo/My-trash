import javax.swing.*;
public class asteriscos9 {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Introduzca valor");
        int n = Integer.parseInt(text);
        for (int a = 0; a < n; a++) {
            for (int i = 0; i < a; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 1; a < n; a++) {
            for (int i = 0; i < n- a - 1; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}