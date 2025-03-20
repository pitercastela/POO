import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        String idade = JOptionPane.showInputDialog("Digite sua idade");
        int idadeDefinitiva = Integer.parseInt(idade);


        if(idadeDefinitiva >= 18) {
            System.out.println("Você está habilitado a se matricular o curso");
            JOptionPane.showMessageDialog(null,"Você está habilitado a se matricular o curso");
        }
        System.out.println(nome);
    }
}

