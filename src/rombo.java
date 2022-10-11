import javax.swing.*;
public class rombo {
    public static void main(String[] args) {

        String text = JOptionPane.showInputDialog("Introduzca base");
        int base = Integer.parseInt(text); //asigna valor por teclado

        for(int i = 0; i < base-1; ++i) { //i= veces que hará el bucle -1
            int j; //contador
            for(j = 0; j < base -1 -i; j++) { //espacios delante de los asteriscos
                System.out.print(" ");
            }

            for(j = 0; j <= i; j++) { //imprime los asteriscos con separación
                System.out.print("* ");
            }

            System.out.println();
            }
        for(int i = 0; i <= base; i++) { //i= veces que hará el bucle
            for(int e = 0; e < i; e++) {// imprime los espacios
                System.out.print(" ");
            }
            for(int a = base; a > i; a--) {//imprime los asteriscos con la separación
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
