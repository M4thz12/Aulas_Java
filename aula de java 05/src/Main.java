import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =   new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Vamos calcular seu IMC", "calculo do imc", 3);
        String altS = JOptionPane.showInputDialog(null, "Digite seu peso", "calculo do imc", -1);
        String pesoS = JOptionPane.showInputDialog(null, "Digite sua altura", "calculo do imc", -1);

        double alt = Double.parseDouble(altS);
        double peso = Double.parseDouble(pesoS);
        double imc;
        imc = peso/(alt*alt) ;
        JOptionPane.showMessageDialog(null, "Seu IMC é de: "+ imc);
    }
}