import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;

        System.out.println("Vamos ver a qual categoria você pertence");
        System.out.println("informe sua idade");
        idade = scan.nextInt();


        if (idade <= 10 ){
            System.out.println("você pertence a categoria infantil");
        }
        else if (idade > 10 && idade <= 13){
            System.out.println("você pertence a categoria infanto-juvenil");
        }
        else if (idade > 13 && idade <= 17){
            System.out.println("você pertence a categoria pré-adolecente");
        }
        else{
            System.out.println("você pertence a categoria adulto");
        };

    }
}
