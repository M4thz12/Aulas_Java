import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radar, velocidade;

        System.out.println("Vamos avaliar se o carro estava dentro do limite de velocidade ou se ele recebeu uma multa");
        System.out.println("Velocidade maxima permitida:");
        radar = scan.nextDouble();
        System.out.println("velocidade que o carro estava:");
        velocidade = scan.nextDouble();

        if (velocidade - radar > 0 && velocidade - radar <= 10){
            System.out.println("o veiculo receu uma multa de 80R$");
        }
        else if (velocidade - radar > 10 && velocidade - radar <= 39){
            System.out.println("o veiculo receu uma multa de 120R$");
        }
        else if (velocidade - radar > 39){
            System.out.println("o veiculo receu uma multa de 200R$");
        }
        else{
            System.out.println("O veiculo está dentro do limite de velocidade");
        };

    }
}
