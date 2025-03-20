import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        float salario, percentualAumento, novoSalario;
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salário?"));
        percentualAumento = Float.parseFloat(JOptionPane.showInputDialog("Qual o percentual de aumento?"));
        novoSalario = (salario + salario * percentualAumento / 100);
        JOptionPane.showMessageDialog(null, "Seu novo salário é:" + novoSalario);
    }
}
