import javax.swing.*;
import java.util.Random;

public class ex03 {
    public static void main(String[] args) {
        int [][] mtz = new int[5][5];
        int[] vetor = new int[5];
        Random ran = new Random();
        String matriz = "";
        String vtr = "";
        int soma = 0;

        for(int i = 0; i<5; i++){
            matriz = matriz +"\n";
            for(int j = 0; j<5;j++){
                int num = ran.nextInt(10);
                mtz[i][j] = num;
                matriz = matriz +" "+ num;
            }
        }
        for(int l = 0; l<5; l++){
            for(int c = 0; c<5;c++){
                vetor[l] = vetor[l] + mtz[l][c];
    }
            vtr = vtr+"a soma da linha "+(l+1) +" é "+vetor[l]+ "\n";
}
        JOptionPane.showMessageDialog(null, matriz);
        JOptionPane.showMessageDialog(null, vtr);
    }
}
