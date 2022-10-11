import java.util.Scanner;
public class NumerosPrimos12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Se crea un objeto scanner
        int contador,I,n;

        System.out.print("Ingresa un número ");
        n = sc.nextInt(); //Asigna valor por teclado a n
        contador = 0;
        for(I = 1; I <= n; I++) {
            if((n % I) == 0) {
                contador++;
            }
            if(contador <= 2) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");
            }
            }
        }
    }