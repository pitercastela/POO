import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int a,b, soma = 0, quantidade = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("b:"));

        if (a > b){
            a++;
            while (a >= b){
                if (b % 2 == 0){
                    System.out.println(b);
                    soma += b;
                    quantidade++;
                }
                b++;
            }
            System.out.println("A soma é: " + soma + "\n A média é: " + soma/quantidade);
        }
        else if (a < b){
            while (a <= b){
                if (a % 2 == 0){
                    System.out.println(a);
                    soma += a;
                    quantidade++;
                }
                a++;
            }
            System.out.println("A soma é: " + soma + "\n A média é: " + soma/quantidade);
        }
    }
}
