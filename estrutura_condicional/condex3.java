package estrutura_condicional;
import java.util.Scanner;

public class condex3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.print("Digite o valor de X: ");
        x = input.nextInt();

        System.out.print("Digite o valor de Y: ");
        y = input.nextInt();

        if (x % y == 0 || y % x == 0){
            System.out.println(x + " e " + y +" São múltiplos entre si");
        }
        else{
            System.out.println(x +" e "+ y + " não são múltiplos entre si");
        }

        input.close();
    }
}
