public class ex03 {
    public static void main(String[] args) {
        System.out.println("agora será exibido os numeros impares entre 100 e 200");
        int valor = 100;

        while (valor < 200){
            if (valor % 2 == 1){
                System.out.println(valor);
            };
            valor = valor + 1;
        };
    }
}
