import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random ran = new Random();

        int [][] mtz = new int[5][5];
        int c;
        int soma = 0;
        String matriz = "";
        String total = "";
        for(int i = 0; i<5; i++){
            matriz = matriz + "\n";
            for(int j = 0; j<5; j++){
                int num = ran.nextInt(10);
                 mtz[i][j] = num;
                 matriz = matriz +" "+ num;
            }
        }
        for(c = 0; c<5; c++){
            soma = soma +  mtz[c][c];
            total = total +" "+ mtz[c][c];
        }
        System.out.println(soma);
        System.out.println(total);
        JOptionPane.showMessageDialog(null, matriz);

    }
}