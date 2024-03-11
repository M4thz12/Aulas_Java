import javax.swing.*;

public class ex04 {
    public static void main(String[] args) {
        int [] qtd_pecas = new int[10];
        double [] preco_peca = new double[10];
        double [] valor_ganho = new double[10];
        String qtd_pecas_lista = "";
        String prec_peca_lista = "";
        String valor_ganho_lista = "";
        for (int cont = 0; cont < 10; cont ++){
            String x = JOptionPane.showInputDialog(null, "Digite a quantidade de peças vendidas pelo vendedor:  " + (cont+1));
            qtd_pecas[cont] = Integer.parseInt(x);
            qtd_pecas_lista = qtd_pecas_lista + "o vendedor " +(cont+1)+" vendeu "+ qtd_pecas[cont] + " peças \n";

            String y = JOptionPane.showInputDialog(null,"Digite o preço da peça vendida pelo vendedor:  " + (cont+1) );
            preco_peca[cont] = Double.parseDouble(y);
            prec_peca_lista = prec_peca_lista  + "a peça do vendedor " +(cont+1)+" vale "+ preco_peca[cont] + " R$ \n";

            double vg = (Integer.parseInt(x) * Double.parseDouble(y));
            valor_ganho[cont] = vg;
            valor_ganho_lista = valor_ganho_lista +"O vendedor "+(cont +1)+ " lucrou "+valor_ganho[cont]+ " R$\n";

        }
        JOptionPane.showMessageDialog(null, qtd_pecas_lista);
        JOptionPane.showMessageDialog(null, prec_peca_lista);
        JOptionPane.showMessageDialog(null, valor_ganho_lista);
    }
}
