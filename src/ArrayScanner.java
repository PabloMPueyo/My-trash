import javax.swing.*;
import java.util.Arrays;

public class ArrayScanner {
    public static void main(String[] args) {
        double[] notas = new double [5]; //declara un Array de 5 espacios
        double suma = 0;
        for (int i = 0; i < 5; i++){ //bucle de 5 veces
            String text = JOptionPane.showInputDialog("Introduzca notas: "); //pide valores
            notas[i] = Integer.parseInt(text); //asigna los valores al array por pop-up
            suma += notas[i]; //suma los valores del array
        }
        double media = suma/5;
        System.out.println(Arrays.toString(notas));
        System.out.println("media = " + media);
    }
}
