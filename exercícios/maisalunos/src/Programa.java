import javax.swing.*;

public class Programa {
        public static void main(String[] args) {
            int n;
            float notas = 0;
            String valor;
            n = Integer.parseInt(JOptionPane.showInputDialog("Número de alunos:"));

            for (int i = 1; i <= n; i++){
                valor = JOptionPane.showInputDialog("Nota do aluno " + i + ":");
                if (Integer.parseInt(valor) == -1 ){
                    break;
                }else {
                    notas += Float.parseFloat(valor);
                }
            }
            System.out.println("Número de alunos: " + n +" Média da turma: " + notas/n);


        }
    }

