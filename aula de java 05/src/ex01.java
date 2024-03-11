import javax.swing.*;

public class ex01 {
    public static void main(String[] args) {
        int [] val = new int [10];
        int numeros_negativos, soma_positivos;
        numeros_negativos = 0;
        soma_positivos = 0;


        for(int cont=0 ; cont < 10; cont++){
            String x = JOptionPane.showInputDialog(null, "Digite o valor " + (cont+1));
            val[cont] = Integer.parseInt(x);
        }

        for(int i = 0; i < 10; i++){
            if (val[i] < 0){
                numeros_negativos += 1;
            }
            if (val[i] > 0){
                soma_positivos += val[i];
            }
        }
        JOptionPane.showMessageDialog(null, "dentro do array tem "+numeros_negativos+ " numero negativos");
        JOptionPane.showMessageDialog(null, "A soma dos numeros positivos é de: "+ soma_positivos);
    }
}
