package estrutura_condicional;
import java.util.Locale;
import java.util.Scanner;


public class condex7 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double x, y;


        System.out.print("Digite o ponto do x: ");
        x = input.nextDouble();

        System.out.print("Digite o ponto do y:");
        y = input.nextDouble();

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
                    if(x < 0 && y < 0){
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
