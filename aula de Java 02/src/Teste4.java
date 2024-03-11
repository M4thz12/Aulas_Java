import java.util.Scanner;
public class Teste4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double resultado, valor1 ;
        System.out.println("digite um valor aleatorio");
        valor1 = scan.nextDouble();
        resultado = valor1 - 4 * 2 * 100 - 56 + 54 * 18 * 70 + 22;
        System.out.println("o resultado foi de: " + resultado);

    }
}
