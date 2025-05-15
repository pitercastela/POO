package exercicio;

public class Moto extends Veiculo {
    @Override
    void acelerar(){
        System.out.println("acelerando a moto");
    }
    @Override
    void frear(){
        System.out.println("freando a moto");
    }
}
