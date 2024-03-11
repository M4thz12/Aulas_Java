import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op, idade;
        double valor;
        System.out.println("""
                ***** Escolha uma opção do menu *****
                1 - Veja a mensagem
                2 - Tire 10% do valor desejado
                3 - Selecione a categoria
                4 - sair
                """);
        op = scan.nextInt();
        if (op == 1){
            System.out.println("""
                    Hakuna Matata
                    What a wonderful phrase
                    Hakuna Matata
                    Ain't no passing craze
                    It means no worries
                    For the rest of your days
                    It's our problem free philosophy
                    Hakuna Matata
                    Why, when he was a young warthog
                    When I was a young warthog
                    Very nice
                    Thanks
                    He found his aroma lacked a certain appeal
                    He could clear the Savannah after every meal
                    I'm a sensitive soul, though I seem thick skinned
                    And it hurt that my friends never stood downwind
                    And oh, the shame
                    (He was ashamed)
                    Thought of changin' my name
                    (Oh, what's in a name?)
                    And I got downhearted
                    (How did you feel?)
                    Every time that I-
                    Hey, Pumbaa, not in front of the kids
                    Oh, sorry
                    Hakuna Matata
                    What a wonderful phrase
                    Hakuna Matata
                    Ain't no passing craze
                    It means no worries
                    For the rest of your days
                    Yeah, sing it, kid
                    It's our problem free philosophy
                    Hakuna Matata
                    Hakuna Matata
                    Hakuna Matata
                    Hakuna Matata
                    Hakuna
                    It means no worries
                    For the rest of your days
                    It's our problem free philosophy
                    Hakuna matata (Hakuna matata)
                    (Hakuna matata) Hakuna matata (Hakuna matata)
                    (Hakuna matata) Hakuna matata
                    Hakuna matata
                    Hakuna matata
                    Hakuna matata
                    Hakuna matata, 'tata, 'tata, hahaha
                    """);
        }

        else if (op == 2){
            System.out.println(" DIGITE UM VALOR PARA TIRAR 10% DELE");
            valor = scan.nextDouble();
            System.out.println(" 10% de "+ valor + " é " + valor/10);
        }
        else if (op == 3){
            System.out.println("digite sua idade");
            idade = scan.nextInt();
            if (idade <= 10){
                System.out.println("você pertence a categoria infantil");
            }else if (idade >10 & idade <=13){
                System.out.println("você pertence a categoria infanto-juvenil");
            }else if (idade > 13 & idade <= 17){
                System.out.println("você pertence a categoria pre-adolecente");
            }else if (idade > 17){
                System.out.println("você pertence a categoria adulto");
            };
        }
        else if (op == 4){
            System.out.println("Você selecionou 'sair' ");
            System.out.println("até a proxima");
        }
        else{
            System.out.println("Insira um valor valido");
        }
    }
}
