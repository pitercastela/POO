package exercicio;

public class TesteExercicio {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        moto.acelerar();
        carro.acelerar();
        moto.frear();
        carro.frear();
    }
}
