import javax.swing.*;
public class UsuarioYContraseña {
    public static void main(String[] args) {
        String user = JOptionPane.showInputDialog("Introduzca nombre de usuario"); //pide valor mediante cuadro de texto
        int u = Integer.parseInt(user); //asigna valor por teclado
        String pass = JOptionPane.showInputDialog("Introduzca contraseña"); //pide valor mediante cuadro de texto
        int c = Integer.parseInt(pass); //asigna valor por teclado
    }
}
