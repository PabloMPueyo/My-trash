import javax.swing.*;
public class Nota5 {
    public static void main(String[] args) {
        String text=JOptionPane.showInputDialog("Nota");
        int n=Integer.parseInt(text);
        if (n<5) {
            JOptionPane.showMessageDialog(null, "Suspenso");
        } else if (n==10) {
            JOptionPane.showMessageDialog(null, "Matricula");
        } else if (n>=8) {
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        } else if (n>=6) {
            JOptionPane.showMessageDialog(null, "Notable");
        } else if (n>=5) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        }
        }
        }
