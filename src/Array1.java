import javax.swing.*;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        for (int c = 0; c < 5; c++) {
            String text = JOptionPane.showInputDialog("Introduzca 5 notas");
            int[] notas = new int[]{Integer.parseInt(text)};

            for (int i = 0; i <= 4; i++) {
                int suma = 0;
                suma += notas[i];
                int media = suma / 5;
                System.out.println(Arrays.toString(notas));
                System.out.println(media);
            }
        }
    }
}
