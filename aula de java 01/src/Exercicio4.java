import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ano, pontos, resultado, resposta;
        pontos = 0;
        System.out.println("""
                Bem vindo!
                vamos jogar um jogo?
                vou mandar 4 perguntas
                cada uma tem a sua pontuação
                quantos pontos coc~e consegue fazer?
                """);
        System.out.println("\nvamos começar\n");
        System.out.println("Questão 1");
        System.out.println("Em que ano se encerrou a segunda guerra mundial?");
        ano = scan.nextInt();
        if (ano == 1945){
            pontos += 15;
            System.out.println("parabens você acertou!");
    }else{
            System.out.println("Você errou!");
        };
        System.out.println("Questão 2");
        System.out.println("qual o log de 81 na base 3?");
        resultado = scan.nextInt();
        if (resultado == 4){
            pontos += 20;
            System.out.println("mandou bem, mais uma pra conta");
        }else{
            System.out.println("não foi dessa vez, mais sorte na proxima");
        };
        System.out.println("Questão 3");
        System.out.println("Quais paises pertencem a America Anglo-Saxonica");
        resposta = scan.nextInt();
        if (resposta == 2){
            pontos += 25;
            System.out.println("acertou, muito bem!");
        }else{
            System.out.println("foi por pouco, a proxima você acerta");
        };
        System.out.println("Questão 4");
        System.out.println("""
                joao tem 24 patas de boi e 32 patas de galinha
                Quantos animais Joao tem?
                """);
        resposta = scan.nextInt();
        if (resposta == 22){
            pontos += 25;
            System.out.println("arrasou, mandou muito bem!");
        }else{
            System.out.println("vish... não foi dessa vez");
        };
        System.out.println("Acabou o jogo");
        System.out.println("Parabéns, você fez " + pontos + " pontos");
}}
