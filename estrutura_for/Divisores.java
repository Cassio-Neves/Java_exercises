package estrutura_for;
import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para saber seus divisores: ");
        int x = input.nextInt();

        for (int i=1; i<=x; i++ ){
            if (x % i == 0){
                System.out.println(i);
            }
        }
        input.close();
    }
    
}
