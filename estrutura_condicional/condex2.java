package estrutura_condicional;
import java.util.Scanner;

public class condex2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int x;
        System.out.print("Digite um número para saber se é par ou ímpar: ");
        x = input.nextInt();

        if (x % 2 == 0){
            System.out.println(x +" é par");
        }
        else{
            System.out.println(x + " é ímpar");
        }
        input.close();
    }
        
}
