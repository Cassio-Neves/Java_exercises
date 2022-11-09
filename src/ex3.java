package src;
import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args){

            Scanner input = new Scanner(System.in);

        int A, B, C, D;

        System.out.println("Digite o valor de A: ");
        A = input.nextInt();

        System.out.println("Digite o valor de B: ");
        B = input.nextInt();

        System.out.println("Digite o valor de C: ");
        C = input.nextInt();

        System.out.println("Digite o valor de D: ");
        D = input.nextInt();

        System.out.println(A * B - C * D);
    
            input.close();
    }
}
