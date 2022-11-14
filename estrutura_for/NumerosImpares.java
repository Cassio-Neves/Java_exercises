package estrutura_for;
import java.util.Scanner;

public class NumerosImpares {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Vamos descobrir os números ímpares até o seu número escolhido!");
        System.out.print("Qual número você deseja? ");
        int x = input.nextInt();

        while (x < 0){
            System.out.println("Por favor, digite um número inteiro!");
            x = input.nextInt();
        }

        for (int i=0; i<x ; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        input.close();
    }
}
