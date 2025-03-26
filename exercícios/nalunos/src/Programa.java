import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int n;
        float notas = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Número de alunos:"));

        for (int i = 1; i <= n; i++){
            notas += Float.parseFloat(JOptionPane.showInputDialog("Nota do aluno " + i + ":"));
        }
        System.out.println("Média da turma: " + notas/n);


    }
}
