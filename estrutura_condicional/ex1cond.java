package estrutura_condicional;
import java.util.Scanner;

public class ex1cond {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int x;
        System.out.print("DIgite um valor para saber se é negativo ou positivo: ");
        x = input.nextInt();

        if (x < 0){
            System.out.println(x + " é negativo");
        }
        else{
            System.out.println(x + " é positivo");
        }
        input.close();
    }
}
