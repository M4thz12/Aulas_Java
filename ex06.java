import javax.swing.*;

public class ex06 {
    public static void main(String[] args) {
        double[] valor = new double[5];
        int[] codigo = new int[5];
        int soma_menor_50 = 0;
        double soma_produtos_100 = 0;
        double media_produtos_100 = 0;
        int qtd_p_100 = 0;
        String codigo_50_100 = "";
        for (int cont = 0; cont < 5; cont++){
            String x = JOptionPane.showInputDialog(null, "Digite o codigo do produto "+(cont + 1));
            codigo[cont] = Integer.parseInt(x);

            String y = JOptionPane.showInputDialog(null, "Digite o valor do produto "+(cont+1));
            valor[cont] = Double.parseDouble(y);


        }
        for (int i = 0; i < 5; i++){
            if (valor[i] < 50){
                soma_menor_50 = soma_menor_50 + 1;
            }
            if (valor[i] > 50 && valor[i] < 100){
                codigo_50_100 = codigo_50_100 +codigo[i]+"\n";
            }
            if (valor[i] > 100){
                soma_produtos_100 += valor[i];
                qtd_p_100 += 1;
            }
        }
        media_produtos_100 = (soma_produtos_100/qtd_p_100);
        JOptionPane.showMessageDialog(null, "O numero de produtos com valor inferior a 50R$ é: "+soma_menor_50);
        JOptionPane.showMessageDialog(null, "os produtos que custam entre 50 e 100 Reais são: \n" + codigo_50_100);
        JOptionPane.showMessageDialog(null, "A media dos produtos com valor acima de 100R$ é de: "+media_produtos_100+"R$");
    }
}
