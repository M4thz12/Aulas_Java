import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int cont = 100; cont < 200; cont++){
            if(cont % 2 == 1){
                System.out.println(cont);
            }
        }
    }
}
