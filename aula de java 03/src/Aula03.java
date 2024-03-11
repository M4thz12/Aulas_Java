import java.util.Scanner;
public class Aula03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op;

        System.out.println("""
                ***** Cadastro de cliente *****
                1 - Cadastrar
                2 - Consultar
                3 - Alterar
                4 - Excluir
                5 - Sair
                """);
        op = scan.nextInt();

        if (op == 1){
            System.out.println("Você acessou o cadastro");
        }
        else if (op == 2){
            System.out.println("Você acessou o consulta");
        }
        else if (op == 3){
            System.out.println("Você alterou o registro");
        }
        else if (op == 4){
            System.out.println("Você excluiu o registro ");
        }
        else if (op == 5){
            System.out.println("Você saiu");
        }else{
            System.out.println("Insira um valor valido");
        }

    }
}
