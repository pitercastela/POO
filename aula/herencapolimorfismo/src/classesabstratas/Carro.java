package classesabstratas;

public class Carro extends Veiculo {

    public String acelerar() {
        return "acelerando o carro";
    }
    @Override
    public String frear(){
        return "freando o carro";
    }

}
