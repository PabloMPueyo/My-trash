import javax.swing.*;
public class asteriscos8 {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Introduzca valor");
        int n = Integer.parseInt(text);
        int d;
        for (int a = 0; a < n; a++) {
            for (d = 0; d < n; d++) {
                System.out.print("*");
            }
            System.out.println();
            for (n = 0; n < d; n++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
