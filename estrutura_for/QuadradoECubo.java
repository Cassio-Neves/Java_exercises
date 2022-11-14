package estrutura_for;
import java.util.Scanner;

public class QuadradoECubo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número de linhas: ");
        int x = input.nextInt();

        for (int i=1; i<=x; i++){
            int first = i;
            int second = i * i;
            int third = i * i * i;

            System.out.printf("%d %d %d%n", first, second, third);
        }

     input.close();   
    }
}
