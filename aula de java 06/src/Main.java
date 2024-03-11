import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int [] valor = new int[5];
        String total = "";
        for (int cont = 0; cont < 5; cont ++){
            String x = JOptionPane.showInputDialog(null, "Digite o valor " + (cont+1));
            valor[cont] = Integer.parseInt(x);
            total = total + valor[cont] + " | ";
        }
        JOptionPane.showMessageDialog(null, total);
    }
}