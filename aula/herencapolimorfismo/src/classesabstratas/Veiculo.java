package classesabstratas;
public abstract class Veiculo {

    final int numeroMinimoDeRodas = 2;
    String placa, chasi;

    abstract public String acelerar();

    public String frear(){
        return "freando";
    }
}
