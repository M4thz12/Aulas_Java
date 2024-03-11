import javax.swing.*;

public class ex03 {
    public static void main(String[] args) {
        int [] val = new int[7];
        String multiplos_2, multiplos_3, multiplos_6;
        multiplos_2 = "";
        multiplos_3 = "";
        multiplos_6 = "";
        for (int i = 0; i < 7; i++){
            String x = JOptionPane.showInputDialog(null, "Digite o valor " +(i+1), "ex03", -1);
            val[i] = Integer.parseInt(x);
        }
        for (int i = 0; i < 7; i++){
            if (val[i] % 2 == 0){
                multiplos_2 += val[i] + " | ";
            }
            if (val[i] % 3 == 0){
                multiplos_3 += val[i] + " | ";
            }
            if (val[i] % 6 == 0){
                multiplos_6 += val[i] + " | ";
            }
        }
        JOptionPane.showMessageDialog(null, "os valores multiplos de 2 são: " +multiplos_2);
        JOptionPane.showMessageDialog(null, "os valores multiplos de 3 são: " +multiplos_3);
        JOptionPane.showMessageDialog(null, "os valores multiplos de 6 são: " +multiplos_6);

    }
}
