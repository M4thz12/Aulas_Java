import java.util.Scanner;
public class Teste5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo, dinheiro;
        int escolha = 0;
        saldo = 2000;


        while (escolha != 4){
            System.out.println("""
                faça sua escolha:
                 
                1 - verificar saldo
                2 - tranferir dinheiro
                3 - receber dinheiro
                4 - sair
                """);
            escolha = scan.nextInt();

            if (escolha == 1){
                System.out.println(saldo);
            }
            else if (escolha == 2){
                System.out.println("quanto deseja transferir?");
                dinheiro = scan.nextInt();
                if (dinheiro > saldo){
                    System.out.println("você não tem saldo suficiente para transferir esse dinheiro");
                }else{
                    saldo = saldo - dinheiro;
                };


            }
            else if (escolha == 3){
                System.out.println("quanto deseja receber?");
                dinheiro = scan.nextInt();
                saldo = saldo + dinheiro;
            }
            else if (escolha == 4){
                System.out.println("obrigado, volte sempre");
            }
            else{
                System.out.println("escolha uma das opções!");
            };
        };
    }
}
