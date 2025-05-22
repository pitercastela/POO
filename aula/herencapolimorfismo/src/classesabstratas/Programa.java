package classesabstratas;

public class Programa {
    public static void main(String[] args) {
        //Veiculo veiculo = new Veiculo(); vai dar erro pq é abstrata
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        System.out.println(carro.acelerar());
        System.out.println(carro.frear());

        System.out.println(moto.frear());
        System.out.println(moto.acelerar());


    }
}
