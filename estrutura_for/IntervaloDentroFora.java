package estrutura_for;
import java.util.Scanner;

public class IntervaloDentroFora {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Digite a quantidade de números 'n' a seguir ");
        System.out.print("Digite o n: ");
        int n = input.nextInt();
        int in = 0, out = 0;

        System.out.println("Digite um número 'x' para saber se está no intervalo [10, 20]");

        for (int i= 0; i<n; i++){
            System.out.print("Digite o x: ");
            int x = input.nextInt();
            if ( x < 10 || x > 20) {
                out+=1;
            }
            else if (x > 10 || x < 20){
                in+=1;
            }
        }
        input.close();
        System.out.println(in+ " in");
        System.out.println(out+ " out");
    }
}
