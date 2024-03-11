import java.util.Scanner;
public class aula02online {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1, n2, resultado;
        resultado = 0;
        int escolha;
        System.out.println("""
    qual tipo de operação você deseja realizar?
    1 - soma
    2 - subtração
    3 - multiplicação
    4 - divisão
    """);
        escolha = scan.nextInt();
        System.out.println("agora escolha os numeros que você quer ralizar a operação");
        System.out.println("primeiro numero:");
        n1 = scan.nextDouble();
        System.out.println("segundo numero:");
        n2 = scan.nextDouble();

        if (escolha == 1){
            resultado = n1 + n2;
        };
        if (escolha == 2){
            resultado = n1 - n2;
        };
        if (escolha == 3){
            resultado = n1 * n2;
        };
        if (escolha == 4){
            resultado = n1 / n2;
        };
        System.out.println("o resultado da operação foi " + resultado);
    }
}
