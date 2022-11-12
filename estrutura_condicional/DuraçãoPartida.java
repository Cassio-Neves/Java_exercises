package estrutura_condicional;
import java.util.Scanner;

public class condex4{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        
        int x,y;
        System.out.print("Digite o horário inicial do jogo: ");
        x = input.nextInt();

        System.out.print("Digite o horário final do jogo: ");
        y = input.nextInt();

        

        if (y < x){
            System.out.print("A duração do jogo foi: " + ((24 - x) + y));

        }
        else{
            System.out.print("A duração do jogo foi: " + (y - x));

        }




        input.close();
    }

}