import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int [] [] matriz = new int[3][3];
        String total = "";
        for (int l = 0; l<3;l++){
            for (int c = 0; c<3;c++){
                String x  = JOptionPane.showInputDialog(null,"Digite o valor da linha "+(l+1)+" e da coluna "+(c+1));
                matriz[l][c] = Integer.parseInt(x);
                total = total + "|" + matriz[l][c] + "|";
            }
            total = total + "\n";
        }
        JOptionPane.showMessageDialog(null,total );
    }
}