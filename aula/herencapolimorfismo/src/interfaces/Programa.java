package interfaces;


public class Programa {
    public static void main(String[] args) {
        Moto moto = new Moto();
        Carro carro = new Carro();

        System.out.println(carro.acelerar());
        System.out.println(carro.frear());

        System.out.println(moto.frear());
        System.out.println(moto.acelerar());


    }
}

