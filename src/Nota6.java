import java.util.Scanner; //import de la clase Scanner
public class Nota6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Se crea un objeto Scanner para meter datos en consola
        String nota;
        double n;
        System.out.print("Introduzca la nota del examen: ");
        nota = sc.nextLine(); //Leer un dato
        n = Double.parseDouble(nota);

        if (n<5) {
            System.out.println("Suspenso");
        } else if (n==10) {
            System.out.println("Matrícula de honor");
        } else if (n>=8) {
            System.out.println("Sobresaliente");
        } else if (n>=6) {
            System.out.println("Notable");
        } else if (n>=5) {
            System.out.println("Suficiente");
        }
    }
}
