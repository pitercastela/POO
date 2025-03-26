import java.util.Scanner;

public class Calcula_circulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o raio do círculo: ");
        float raio = teclado.nextFloat();

        double perimetro = 2 * Math.PI * raio;
        double area = (Math.pow(raio, 2)*Math.PI);

        System.out.println("O perímetro é: " + perimetro);
        System.out.println("O raio é: " + area);
    }
}
