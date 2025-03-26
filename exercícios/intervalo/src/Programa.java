import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int n, inferior, superior;

        n = Integer.parseInt(JOptionPane.showInputDialog("Insira o número:"));
        inferior = Integer.parseInt(JOptionPane.showInputDialog("Insira o limite inferior do intervalo:"));
        superior = Integer.parseInt(JOptionPane.showInputDialog("Insira o limite superior do intervalo:"));

        if (n > superior){

            JOptionPane.showMessageDialog(null, "n está depois do intervalo");
        } else if (n > inferior && n < superior) {
            JOptionPane.showMessageDialog(null, "n está dentro do intervalo");
        } else if (n < inferior) {
            JOptionPane.showMessageDialog(null, "n está antes do intervalo");
        }

    }
}
