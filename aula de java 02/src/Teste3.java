import java.util.Scanner;
public class Teste3 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            double n1,n2,n3, media;
            String nome;

           System.out.println("Digite seu nome: ");
           nome = scan.nextLine();
           System.out.println("Agora digite as suas notas dos 3 semestres");
           n1 = scan.nextDouble();
           n2 = scan.nextDouble();
           n3 = scan.nextDouble();
           media = (n1 + n2 + n3)/3;
        System.out.println("a media do aluno: " + nome + "foi de: " + media);
    }
}
