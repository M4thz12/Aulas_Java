import javax.swing.*;
import java.util.Random;

public class ex02 {
    public static void main(String[] args) {
        Random ran = new Random();

        int [][] mtz = new int[5][5];
        int c;
        int soma = 0;
        String total = "";
        String matriz = "";
        for(int i = 0; i<5; i++){
            matriz = matriz +"\n";
            for(int j = 0; j<5; j++){
                int num = ran.nextInt(10);
                mtz[i][j] = num;
                matriz = matriz +" "+num;

                if(i%2==0) {
                    soma = soma + num;
                    total = total + " " + mtz[i][j];

                }
            }
        }
        System.out.println(soma);
        System.out.println(total);
        JOptionPane.showMessageDialog(null,matriz);
    }
}
