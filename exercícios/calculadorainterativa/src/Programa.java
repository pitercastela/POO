import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        String op;
        float a, b, resultado;
        resultado = 0;
        op = JOptionPane.showInputDialog("Digite o sinal da operação:");
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite o operando a:"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite o operando b:"));

        if (op.equals("+"))
        {
            resultado = a + b;
        } else if (op.equals("-")) {
            resultado = a - b;
        } else if (op.equals("*")) {
            resultado = a * b;
        } else if (op.equals("/")) {
            resultado = a / b;
        }else {
            JOptionPane.showMessageDialog(null, "Componente invalido!");
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, a + op +  b + " = "  + resultado);
    }
}
