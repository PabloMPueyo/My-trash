import javax.swing.*;
public class ejercicio39 {
    public static void main(String[] args) {

        String text = JOptionPane.showInputDialog("Introduce valor");
        int num = Integer.parseInt(text); //numero de asteriscos introducido por teclado

        for(int i = 0; i < num; i++) { //i = número de veces que hará el bucle
            int j; //contador interno
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            System.out.println(""); //salto de linea
        }
        }

    }
