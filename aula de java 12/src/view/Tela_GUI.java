package view;

import javax.swing.*;

public class Tela_GUI {
    public static void tela(){

        int val = 0;
        while( val != 2) {
            model.Calculo_DAO.x = JOptionPane.showInputDialog(null, "Selecione\n1- Calculo\n2- Sair");
            val = Integer.parseInt(model.Calculo_DAO.x);

            if (val == 1){
                model.Calculo_DAO.soma();
            }

        }
    }
}
