import javax.swing.*;
public class pirámide2 {
    public static void main(String[] args) {

        String text = JOptionPane.showInputDialog("Introduce valor");
        int num = Integer.parseInt(text); //numero de asteriscos introducido por teclado

        for(int i = 0; i < num; ++i) { //i = número de veces que hará el bucle
            int j; //contador interno
            for(j = 0; j < num - 1 - i; ++j) { //centra los asteriscos
                System.out.print(" ");
            }

            for(j = 0; j <= i; ++j) { //Imprime asteriscos y espacios en la línea
                System.out.print("* ");
            }

            System.out.println(""); //salto de linea
        }

    }
}