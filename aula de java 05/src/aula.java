import javax.swing.*;

public class aula {
    public static void main(String[] args) {

        int [] val = new int [5];
        String total="";
        for(int cont=0 ; cont < 5; cont++){
            String x = JOptionPane.showInputDialog(null, "Digite o valor " + (cont+1));
            val[cont] = Integer.parseInt(x);
            total = total + val[cont] + " | ";
        }

        JOptionPane.showMessageDialog(null, total);

    }
}
