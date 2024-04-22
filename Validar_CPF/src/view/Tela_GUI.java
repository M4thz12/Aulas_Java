package view;

import javax.swing.*;

public class Tela_GUI {
    public static void tela(){
        String x = "";
        int esc = 0;
        x = JOptionPane.showInputDialog(null, "Selecione\n1- Gerar CPF\n2- Validar Cpf\n3- Sair");
        esc = Integer.parseInt(x);
        if(esc == 1){
            model.Calculos_DAO.gerar();
        }else if(esc == 2){

        }else{
            JOptionPane.showMessageDialog(null,"deu errado");
        }

    }
}
