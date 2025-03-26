import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int t;
        t = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de segundos"));

        JOptionPane.showMessageDialog(null, "segundos: " + t + "\nminutos: " + t / 60 + "\nhoras: " + t / 3600);
    }
}