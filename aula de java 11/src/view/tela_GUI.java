package view;

import javax.swing.*;

public class tela_GUI {
    public static void Solicitaoperacao(){
        String x = JOptionPane.showInputDialog(null,"Escolha a opeção:\n 1 - Soma\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão");
        int op = Integer.parseInt(x);
        switch (op){
            case 1:
                model.ClasseX_DAO.soma();
                break;
            case 2:
                model.ClasseX_DAO.subtracao();
                break;
            case 3:
                model.ClasseX_DAO.multiplicacao();
                break;
            case 4:
                model.ClasseX_DAO.divisao();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Valor invalido");
                break;
        }
    }
}
