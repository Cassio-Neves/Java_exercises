package estrutura_repetiva;
import java.util.Scanner;

public class SistemaCartesiano {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite o valor do x: ");
        int x = input.nextInt();

        System.out.print("Digite o valor do y: ");
        int y = input.nextInt();


        while (x != 0 || y != 0){
            System.out.print("Digite o valor do x: ");
            x = input.nextInt();

            System.out.print("Digite o valor do y: ");
            y = input.nextInt();
        }

        if (x == 0 && y == 0){
            System.out.println("Origem");
        }
        else{
            if (x > 0 && y > 0){
                System.out.println("Quadrante 1");
            }
            else{
                if (x < 0 && y > 0){
                    System.out.println("Quadrante 2");
                }
                else{
                    if (x < 0 && y < 00){
                        System.out.println("Quadrante 3");
                    }
                    else{
                        if (x > 0 && y < 0){
                            System.out.println("Quadrante 4");
                        }
                    }
                     
                }
            }
        }
        

        input.close();
    }
}
