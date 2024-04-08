import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      int [][] mat = new int[5][5];
      int l = 0, c= 0, soma = 0;
      Random ale = new Random();
      String total = "";

      for (l = 0; l < 5; l++){
          for (c = 0; c < 5; c++){
              mat[l][c] = ale.nextInt(10);
              total += mat[l][c] + " ";

          }
          total += "\n";
      }
        JOptionPane.showMessageDialog(null, total);
      c = 4;
      for (l = 0; l < 5; l++){
          soma += mat[l][c];
          c--;
      }
      JOptionPane.showMessageDialog(null, soma);
    }
}