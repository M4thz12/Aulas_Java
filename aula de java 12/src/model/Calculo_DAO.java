package model;

import javax.swing.*;

public class Calculo_DAO {
    public static double v1 = 0, v2 = 0;
    public static String x = "";
    public static void soma(){
        x = JOptionPane.showInputDialog(null, "Digite um valor");
        v1 = Double.parseDouble(x);
        x = JOptionPane.showInputDialog(null, "Digite outro valor");
        v2 = Double.parseDouble(x);
        JOptionPane.showMessageDialog(null, "O resultado da soma é "+(v1 + v2));
    }
}
