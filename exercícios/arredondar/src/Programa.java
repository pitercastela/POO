import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        float x;
        x = Float.parseFloat(JOptionPane.showInputDialog("Insira o número a ser arredondado: "));
        JOptionPane.showMessageDialog(null, "O número arredondado é: " + Math.round(x));
    }
}
