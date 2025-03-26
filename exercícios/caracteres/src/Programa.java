import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        String caractere = "";
        int vogais =0, digitos = 0, outros =0;

        while (true){
            caractere = JOptionPane.showInputDialog("Novo caractere: ");
            if (caractere.equals(".")){
                break;
            }
            if (caractere.equals("a") || caractere.equals("e") || caractere.equals("i") || caractere.equals("o") || caractere.equals("u")){
                vogais++;
            }
            if (caractere.equals("2") || caractere.equals("3") || caractere.equals("4") || caractere.equals("5") || caractere.equals("6") || caractere.equals("7") || caractere.equals("8") || caractere.equals("9") || caractere.equals("0") || caractere.equals("1")){
                digitos++;
            }else {
                outros++;
            }
        }

        System.out.println("Dígitos: " + digitos + "\nvogais: " + vogais + "\noutros: " + outros);

    }
}
