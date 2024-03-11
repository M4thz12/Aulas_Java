import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nmr1, nmr2, nmr3, var;
        var = 0;
        System.out.println("digite 3 numeros");
        System.out.println("numero 1:");
        nmr1 = scan.nextInt();
        System.out.println("numero 2:");
        nmr2 = scan.nextInt();
        System.out.println("numero 3:");
        nmr3 = scan.nextInt();
        for(int count = 1; count <= 6; count++){
            if(nmr1 > nmr2){
            var = nmr1;
            nmr1 = nmr2;
            nmr2 = var;
            }
            else if(nmr2 > nmr3) {
            var = nmr2;
            nmr2 = nmr3;
            nmr3 = var;
            }}
        System.out.println(nmr1 + " " + nmr2 + " " + nmr3);
    }
}
