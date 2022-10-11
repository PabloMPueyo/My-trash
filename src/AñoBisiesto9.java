import java.util.Scanner;

public class AñoBisiesto9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Se crea un objeto scanner
        int n;
        int a;
        System.out.println("Introduzca mes (1-12)");
        n = sc.nextInt(); //asigna a la variable n el número introducido por teclado
        System.out.println("Introduzca año");
        a = sc.nextInt(); //asigna a la variable al número introducido por teclado

        switch (n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                if((a % 4 == 0 && a % 100 != 0) || (a % 100 == 0 && a % 400 == 0)) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
                break;

        }


    }}