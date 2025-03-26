import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int distancia, tempo, combustivel;
        float velocidadeMedia, consumoDeCombustivel;
        distancia = Integer.parseInt(JOptionPane.showInputDialog("Distancia percorrida em KM"));
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Tempo passado em h"));
        combustivel = Integer.parseInt(JOptionPane.showInputDialog("Combústivel gasto em litros"));

        velocidadeMedia = (float) (distancia / tempo);
        consumoDeCombustivel = (float) (distancia / combustivel);

        JOptionPane.showMessageDialog(null, "Velocidade média: " + velocidadeMedia + "KM/h" + "\nConsumo de combustível: " + consumoDeCombustivel + "KM/l");
    }
}
