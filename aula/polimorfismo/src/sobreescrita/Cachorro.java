package sobreescrita;

public class Cachorro extends Animal {

    public String nome;

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}