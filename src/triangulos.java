import javax.swing.*;
public class triangulos {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Introduzca lado");
        int num = Integer.parseInt(text);
        for(int i = 0; i < num; ++i) { //i = número de veces que hará el bucle
            int j; //contador interno
            for (j = 0; j < num - 1 - i; ++j) { //centra los asteriscos
                System.out.print(" ");
            }

            for (j = 0; j <= i; ++j) { //Imprime asteriscos y espacios en la línea
                System.out.print("* ");
            }

            System.out.println(""); //salto de linea
        }
                for (int col = 1; col <= 4; col++) { //número de columnas
                    System.out.println(); //salto de linea
                    for (int cont = 1; cont <= 4; cont++) { //número de repeticiones
                        System.out.print("  ");
                    }
                }
        for(int i = 0; i <= num; i++) { //i= veces que hará el bucle
            for(int e = 0; e < i; e++) {// imprime los espacios
                System.out.print(" ");
            }
            for(int a = num; a > i; a--) {//imprime los asteriscos con la separación
                System.out.print("* ");
            }
            System.out.println();
        }

            }

    }
