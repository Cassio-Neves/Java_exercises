package estrutura_for;
import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para saber seu fatorial: ");
        int x = input.nextInt();
        if (x == 0){
            System.out.println("Fatorial de 0 é: 1");
        }
        else{
        int conta = 1;
        for (int i=1; i<=x; i++){
            conta = conta * i;
        
        }
        System.out.println(conta);
    }
        input.close();
    }
}
