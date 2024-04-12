package model;

import javax.swing.*;

public class ClasseX_DAO {
    public static double v1 = 0, v2 = 0;
    public static String x = "";
    public static void soma(){
        x = JOptionPane.showInputDialog(null,"Escolha um valor para soma:");
        v1 = Integer.parseInt(x);
        x = JOptionPane.showInputDialog(null,"Escolha um valor para soma:");
        v2 = Integer.parseInt(x);

        JOptionPane.showMessageDialog(null,"A soma é : "+(v1+v2));
    }

    public static void subtracao(){
        x = JOptionPane.showInputDialog(null,"Escolha um valor para subtração:");
        v1 = Integer.parseInt(x);
        x = JOptionPane.showInputDialog(null,"Escolha um valor para subtração:");
        v2 = Integer.parseInt(x);

        JOptionPane.showMessageDialog(null,"A subtração é : "+ (v1-v2));
    }

    public static void multiplicacao(){
        x = JOptionPane.showInputDialog(null,"Escolha um valor para multiplicacao:");
        v1 = Integer.parseInt(x);
        x = JOptionPane.showInputDialog(null,"Escolha um valor para multiplicacao:");
        v2 = Integer.parseInt(x);

        JOptionPane.showMessageDialog(null,"A multiplicacao é : "+(v1*v2));
    }

    public static void divisao(){
        x = JOptionPane.showInputDialog(null,"Escolha um valor para divisao:");
        v1 = Integer.parseInt(x);
        x = JOptionPane.showInputDialog(null,"Escolha um valor para divisao:");
        v2 = Integer.parseInt(x);
        double resultado = (v1/v2);
        JOptionPane.showMessageDialog(null,"A divisao é : "+resultado);
    }
}
