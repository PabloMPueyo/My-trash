public class Astericos6 {
    public static void main(String[] args) {
        System.out.println("     *"); //imprime * con espacios delante
        for(int cont = 0; cont <= 2; cont++) {  //recuerda siempre imprime también el asterisco de la posición 0
            System.out.print("  *");
        }
        System.out.println(); //salto de linea
        for(int cont = 0; cont <= 4; cont++) {
            System.out.print(" *");
        }
    }
}
