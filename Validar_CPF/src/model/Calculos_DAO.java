package model;

import javax.swing.*;
import java.util.Random;

public class Calculos_DAO {
    public static void gerar(){
        Random random  = new Random();
        int [] vetor = new int[11];
        int soma = 0;
        for(int i = 0; i < 9; i++){
            int vl = random.nextInt(10);
            vetor[i] = vl;

        }
        for (int i = 0; i < 9; i++) {
           soma += vetor[i]*(10 - i);
        }
        int resto = soma%11;
        if(resto < 2){
            vetor[9] = 0;
        }else{
            vetor[9] = 11 - resto;
        }
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetor[i]*(10 - i);

        }

        resto = soma%11;
        if(resto < 2){
            vetor[10] = 0;
        }else{
        vetor[10] = 11 - resto;
        }
        String vt = "";
        for(int i = 0; i < 11; i++){
           vt += vetor[i]+ " ";
        }
        JOptionPane.showMessageDialog(null, vt);
    }
    public static void verificar(){

    }
}
