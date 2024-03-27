import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String x = "";
        int valor = 0;
        double valor2;
        x = JOptionPane.showInputDialog(null, "Digite um valor inteiro");
        valor = Integer.parseInt(x);
        x = JOptionPane.showInputDialog(null, "Digite um valor double");
        valor2 = Double.parseDouble(x);
        JOptionPane.showMessageDialog(null, valor +" | "+ valor2);

    }
}