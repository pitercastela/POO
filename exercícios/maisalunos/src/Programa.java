import javax.swing.*;

public class Programa {
        public static void main(String[] args) {
            int n = 0;
            float notas = 0, maiorNota = 0, menorNota = 100;
            String valor;

            while (true){
                valor = JOptionPane.showInputDialog("Nota do aluno:");
                if (Integer.parseInt(valor) == -1 ){
                    break;
                }else {
                    n++;
                    notas += Float.parseFloat(valor);
                    if (Float.parseFloat(valor)  > maiorNota){
                        maiorNota = Float.parseFloat(valor);
                    }
                    if (Float.parseFloat(valor) < menorNota){
                        menorNota = Float.parseFloat(valor);

                    }
                }
            }
            System.out.println("Número de alunos: "+ n + "\nMédia da turma: " + notas/n + "\n Maior nota:" + maiorNota + "\n Menor nota: " +menorNota);


        }
    }

