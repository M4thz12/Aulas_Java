import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  nmr, cont;
        System.out.println("quantas vezes a mensagem deve ser exibida");
        nmr = scan.nextInt();

        for(cont = nmr; cont > 0; cont--){
            System.out.println("isso é um teste");
        }
    }
}
