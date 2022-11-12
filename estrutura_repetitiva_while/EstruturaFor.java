package estrutura_repetiva;
import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        int soma = 0;

        for(int i=0; i<x; i++){
            int y = input.nextInt();
            soma+=y;

        }
    }
    
}
