import javax.swing.*;

public class ex07 {
    public static void main(String[] args) {

        double[] total_vendas = new double[5];
        int[] codigo_vendedores = new int[5];
        double[] percentual_comissao = new double[5];
        int soma_vendas = 0;

        for(int count = 0; count < 5; count++){
            String x = JOptionPane.showInputDialog(null, "Digite o total e vendas do vendedor "+(count+1));
            total_vendas[count] = Double.parseDouble(x);

            String y = JOptionPane.showInputDialog(null, "Digite o codigo do vendedor "+(count+1));
            codigo_vendedores[count] = Integer.parseInt(y);

            String z = JOptionPane.showInputDialog(null, "Digite o percentual de comissao do vendedor "+(count+1));
            percentual_comissao[count] = Double.parseDouble(x)*(Double.parseDouble(z)/100);

        }
        String cod_perc = "";
        for (int i = 0; i < 5; i++){
            soma_vendas += total_vendas[i];
            cod_perc = "O vendedor do codigo: "+codigo_vendedores+ " vai receber: "+percentual_comissao+"\n";
        }



        JOptionPane.showMessageDialog(null,cod_perc );
        JOptionPane.showMessageDialog(null, "a soma do valor das vendas foi de: "+soma_vendas);
    }
}
