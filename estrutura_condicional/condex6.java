package estrutura_condicional;
import java.util.Scanner;
import java.util.Locale;

public class condex6 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double x;
        System.out.print("Digite um valor para saber se está nos intervalos (([0,25], (25,50], (50,75], (75,100]): ");
        x = input.nextDouble();

        if (x >= 0 && x < 25){
            System.out.println(x + " está no intervalo [0,25]");
        }
        else{
            if (x >= 25 && x < 50){
                System.out.println(x + " está no intervalo [25,50]");
            }
            else{
                if (x >= 50 && x < 75){
                    System.out.println(x + " está no intervalo [50,75]");
                }
                else{
                    if (x >= 75 && x <=100){
                        System.out.println(x + " está no intervalo [75, 100]");
                    }
                    else{
                        System.out.println(x + " está fora do intervalo");
                    }
                }
            }
        }


        input.close();

    }
    
}
