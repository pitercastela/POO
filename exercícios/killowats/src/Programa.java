import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int killowat;
        float valor, preco;
        killowat = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor em Quillowat"));
        preco = Float.parseFloat(JOptionPane.showInputDialog("Insira o preço do Quillowat"));

        if(killowat < 150)
        {
            valor = (killowat * preco) - ((killowat * preco)/10);
        }
        else {
            valor = (killowat * preco);
        }
        JOptionPane.showMessageDialog(null, "O valor a ser pago é: R$" + valor);
    }
}
