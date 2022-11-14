package estrutura_for;
import java.util.Scanner;

public class DivisaoPares {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de pares: ");
        int n = input.nextInt();

        for (int i =0; i<=n; i++){


            System.out.print("Digite o numerador: ");
            int x = input.nextInt();
            System.out.print("Digite o denominador: ");
            int y = input.nextInt();

            if (y == 0){
                System.out.println("divisão impossível");
            }
            else{
                 double divisão = (double) x/y;
                 System.out.println(divisão);
            }
            
            
            
            
        }

        input.close();
    }
}
