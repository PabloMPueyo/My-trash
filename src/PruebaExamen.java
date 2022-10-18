import javax.swing.*;

public class PruebaExamen {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        int nota = 0;
        boolean flag = false;
        System.out.println("Pregunta 1- Los diagramas de casos de uso son: ");
        System.out.println("a- Entidades que declara una serie de atributos, funciones y obligaciones.");
        System.out.println("b- Representaciones de una relación jerárquica entre un objeto y las partes que lo componen");
        System.out.println("c- Un elemento fundamental del análisis de un sistema desde la perspectiva de la orientación a objetos");
        System.out.println("d- Plátanos");
        do {
            String respuesta = JOptionPane.showInputDialog("Escoja la respuesta correcta"); //asigna valor por teclado
            if(respuesta != null) if (respuesta.equals(c) || respuesta.equals(a) || respuesta.equals(b) || respuesta.equals(d)) {
                flag = true;
                if (respuesta.equals(c)) {
                    nota++;
                }
            } else {
                System.out.println("Respuesta incorrecta");
            }
        } while (!flag);
        System.out.println();
        System.out.println("Pregunta 2- ¿Cuántos actores máximos tienen los Diagramas de Casos?");
        System.out.println("a- Infinitos");
        System.out.println("b- Como mucho 5");
        System.out.println("c- Exactamente 7");
        System.out.println("d- Mínimo 2");
        do {
            flag = false;
            String respuesta = JOptionPane.showInputDialog("Escoja la respuesta correcta"); //asigna valor por teclado
            if(respuesta != null) if (respuesta.equals(c) || respuesta.equals(a) || respuesta.equals(b) || respuesta.equals(d)) {
                flag = true;
                if (respuesta.equals(a)) {
                    nota++;
                }
            } else {
                System.out.println("Respuesta incorrecta");
            }
        } while (!flag);
        System.out.println();
        System.out.println("Pregunta 3- Elige la respuesta correcta:" +
                "En un diagrama de Casos");
        System.out.println("a- Todos los actores deben ser humanos");
        System.out.println("b- Ninguno de los actores puede ser humano");
        System.out.println("c- 42");
        System.out.println("d- Los actores pueden ser humanos o no");

        do {
            flag = false;
            String respuesta = JOptionPane.showInputDialog("Escoja la respuesta correcta"); //asigna valor por teclado
            if(respuesta != null) if (respuesta.equals(c) || respuesta.equals(a) || respuesta.equals(b) || respuesta.equals(d)) {
                flag = true;
                if (respuesta.equals(d)) {
                    nota++;
                }
            } else {
                System.out.println("Respuesta incorrecta");
            }
        } while (!flag);
        System.out.println();
        System.out.println("Pregunta 4: Los Diagramas de clases se componen de:");
        System.out.println("a- Cabezal, cuerpo y pies");
        System.out.println("b- Nombre, atributos y funciones");
        System.out.println("c- Título, texto y final");
        System.out.println("d- Arriba, medio y bajo");

        do {
            flag = false;
            String respuesta = JOptionPane.showInputDialog("Escoja la respuesta correcta"); //asigna valor por teclado
            if(respuesta != null) if (respuesta.equals(c) || respuesta.equals(a) || respuesta.equals(b) || respuesta.equals(d)) {
                flag = true;
                if (respuesta.equals(b)) {
                    nota++;
                }
            } else {
                System.out.println("Respuesta incorrecta");
            }
        } while (!flag);
        System.out.println();
        System.out.println("Pregunta 5- Una línea que acaba en un rombo en blanco, en un diagrama de Clases, es:");
        System.out.println("a- Relación de Agregación");
        System.out.println("b- Relación de Composición");
        System.out.println("c- Relación de Asociación");
        System.out.println("d- Relación de Tabulación");

        do {
            flag = false;
            String respuesta = JOptionPane.showInputDialog("Escoja la respuesta correcta"); //asigna valor por teclado
            if(respuesta != null) if (respuesta.equals(c) || respuesta.equals(a) || respuesta.equals(b) || respuesta.equals(d)) {
                flag = true;
                if (respuesta.equals(a)) {
                    nota++;
                }
            } else {
                System.out.println("Respuesta incorrecta");
            }
        } while (!flag);
        System.out.println();
        System.out.println("Pregunta 6- En Diagramas, las herencias:");
        System.out.println("a- Tienen una flecha vacía");
        System.out.println("b- Son tanto de Diagramas de Casos como de Usos");
        System.out.println("c- Son un tipo de relación");
        System.out.println("d- Todas las anteriores son correctas");

        do {
            flag = false;
            String respuesta = JOptionPane.showInputDialog("Escoja la respuesta correcta"); //asigna valor por teclado
            if(respuesta != null) if (respuesta.equals(c) || respuesta.equals(a) || respuesta.equals(b) || respuesta.equals(d)) {
                flag = true;
                if (respuesta.equals(d)) {
                    nota++;
                }
            } else {
                System.out.println("Respuesta incorrecta");
            }
        } while (!flag);
        System.out.println();
        System.out.println("Pregunta 7- ¿Qué significan las siglas UML?");
        System.out.println("a- Unidad Masiva Letárgica");
        System.out.println("b- Unified Modeling Language");
        System.out.println("c- Ultra Man Lite");
        System.out.println("d- Union Modular Lineal");

        do {
            flag = false;
            String respuesta = JOptionPane.showInputDialog("Escoja la respuesta correcta"); //asigna valor por teclado
            if(respuesta != null) if (respuesta.equals(c) || respuesta.equals(a) || respuesta.equals(b) || respuesta.equals(d)) {
                flag = true;
                if (respuesta.equals(b)) {
                    nota++;
                }
            } else {
                System.out.println("Respuesta incorrecta");
            }
        } while (!flag);
        System.out.println();
        System.out.println("Pregunta 8- En un diagrama de Casos:");
        System.out.println("a- Un actor solo puede hacer una acción");
        System.out.println("b- Cada actor puede hacer las acciones que quiera");
        System.out.println("c- Dos o más actores pueden realizar la misma acción");
        System.out.println("d- Dos actores no pueden realizar la misma acción");

        do {
            flag = false;
            String respuesta = JOptionPane.showInputDialog("Escoja la respuesta correcta"); //asigna valor por teclado
            if(respuesta != null) if (respuesta.equals(c) || respuesta.equals(a) || respuesta.equals(b) || respuesta.equals(d)) {
                flag = true;
                if (respuesta.equals(c)) {
                    nota++;
                }
            } else {
                System.out.println("Respuesta incorrecta");
            }
        } while (!flag);
        System.out.println();
        System.out.println("Pregunta 9- En un diagrama de Clases");
        System.out.println("a- Cada clase puede tener varios atributos y funciones");
        System.out.println("b- Cada clase tiene mas de un nombre");
        System.out.println("c- Los atributos de una clase son únicos y no pueden ser heredados");
        System.out.println("d- Las clases no se relacionan entre ellas");

        do {
            flag = false;
            String respuesta = JOptionPane.showInputDialog("Escoja la respuesta correcta"); //asigna valor por teclado
            if(respuesta != null) if (respuesta.equals(c) || respuesta.equals(a) || respuesta.equals(b) || respuesta.equals(d)) {
                flag = true;
                if (respuesta.equals(a)) {
                    nota++;
                }
            } else {
                System.out.println("Respuesta incorrecta");
            }
        } while (!flag);
        System.out.println();
        System.out.println("Pregunta 10- Include, Extend, Agregación, Asociación, Composición y Herencia son:");
        System.out.println("a- Atributos");
        System.out.println("b- Relaciones");
        System.out.println("c- Invenciones");
        System.out.println("d- Metáforas");

        do {
            flag = false;
            String respuesta = JOptionPane.showInputDialog("Escoja la respuesta correcta"); //asigna valor por teclado
            if(respuesta != null) if (respuesta.equals(c) || respuesta.equals(a) || respuesta.equals(b) || respuesta.equals(d)) {
                flag = true;
                if (respuesta.equals(c)) {
                    nota++;
                }
            } else {
                System.out.println("Respuesta incorrecta");
            }
        } while (!flag);
        System.out.println("Tu nota es: " + nota);
        if (nota <= 4) {
            System.out.println("Suspenso chamaco, estudia mas");
        }
        if (nota >= 5) {
            System.out.println("Aprobaste máquina, sigue así");
        }
    }
}