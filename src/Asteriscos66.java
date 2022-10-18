public class Asteriscos66 {
    public static void main(String[] args) {
        System.out.print("  "); //centrar punta de piramide
        System.out.println("*"); //punta
        for(int col=0;col<=0;col++) {
            System.out.print(" "); //centrar segunda línea de pirámide
            for (int n = 2; n <= 4; n++) { //segunda fila
                System.out.print("*");
            }
            for (col = 0; col <= 0; col++) { //última fila de la pirámide
                for (int n = 0; n <= 4; n++) ;
            }
        }
    }
}