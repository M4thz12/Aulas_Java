import javax.swing.*;

public class ex01 {
    public static void main(String[] args) {
        int [][]mtz = new int[6][6];
        String total = "";

        for(int l = 0; l < 6; l++){
            for(int c = 0; c < 6; c++){

                 if((l == 1 && c != 0 && c != 5)||(( l == 4 && c != 5 && c != 0))) {
                    mtz[l][c] = 2;
                }if((l == 1 && c == 0 || c == 5 )||(( l == 4 && c == 5 || c == 0))) {
                    mtz[l][c] = 1;
                }if((l == 2 && c == 1 || c == 4 )||(( l == 3 && c == 4 || c == 1))) {
                    mtz[l][c] = 2;
                }if(l == 0 || l == 5){
                    mtz[l][c] = 1;
                }if(mtz[l][c] == 0){
                    mtz[l][c] = 3;
                }

                total = total + mtz[l][c]+ " | ";
            }
            total = total + "\n";
        }
        JOptionPane.showMessageDialog(null, total);


    }
}
