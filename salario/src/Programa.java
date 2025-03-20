import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        float salario, percentual_aumento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o seu salário: ");
        salario = teclado.nextFloat();
        System.out.println("Qual o percentual de aumento: ");
        percentual_aumento = teclado.nextFloat();
        System.out.println("O novo salár1io é: " + (salario + salario * percentual_aumento / 100));
    }
}
