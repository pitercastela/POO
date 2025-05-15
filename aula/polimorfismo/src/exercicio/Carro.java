package exercicio;

public class Carro extends Veiculo {
    @Override
    void acelerar(){
        System.out.println("acelerando o carro");
    }
    @Override
    void frear(){
        System.out.println("freando o carro");
    }
}
