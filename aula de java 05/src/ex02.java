import javax.swing.*;

public class ex02 {
    public static void main(String[] args) {
        int [] val = new int[5];
        String numeros_positivos = "";


        for (int i = 0; i < 5; i++){
            String x = JOptionPane.showInputDialog(null, "Digite o valor "+(i+1),"ex02", -1);
             val[i] = Integer.parseInt(x);
        }
        for (int i = 0; i < 5; i++){
            if (val[i] > 0){
                numeros_positivos = numeros_positivos + val[i] + " | ";
            }
        }
        JOptionPane.showMessageDialog(null,numeros_positivos);

    }
}
