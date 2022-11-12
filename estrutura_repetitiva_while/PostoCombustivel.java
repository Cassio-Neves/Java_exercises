package estrutura_repetiva;
import java.util.Scanner;


public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número do combustível: ");
        int user = input.nextInt();


        int soma_al = 0;
        int soma_gas = 0;
        int soma_di = 0;

        while (user != 4){
            if (user == 1){
                soma_al+=1;
            }
            else if (user == 2){
                soma_gas += 1;
            }
            else if (user == 3){
                soma_di += 1;
            }
            System.out.print("Digite o número do combustível: ");
            user = input.nextInt();
            }
            
        System.out.println("Muito Obrigado!");
        System.out.println("Álcool: " + soma_al);
        System.out.println("Gasolina: " + soma_gas);
        System.out.println("Diesel: "+ soma_di);
        
        input.close();
        }

        
 
    }
