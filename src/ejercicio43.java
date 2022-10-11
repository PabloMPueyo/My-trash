public class ejercicio43 {
    public static void main(String[] args) {
        int c;
        for (c = 0; c <= 5; c++) {
            for (int i = 0; i <= c; i++) {
                if (i%2 != 0) {
                    System.out.println(i + " es primo");
                } else {
                    i++;
                }

            }
        }
    }
}