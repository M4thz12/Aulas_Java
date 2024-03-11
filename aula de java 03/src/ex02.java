import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor, count;
        count = 1;
        System.out.println("digite o valor e sua tabuada será exibida");
        valor = scan.nextInt();
        while(count < 11 ){
            System.out.println(count +" * " +valor+ " = " + (count*valor));
            count += 1;
        };

    }
}
