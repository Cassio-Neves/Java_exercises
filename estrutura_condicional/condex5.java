package estrutura_condicional;
import java.util.Scanner;
import java.util.Locale;

 /*
        código  especificação         preço
        1        Cachorro Quente      R$ 4.00
        2        X-Salada             R$ 4.50
        3        X-Bacon              R$ 5.00
        4        Torrada simples      R$ 2.00
        5        Refrigerante         R$ 1.50
        */
public class condex5 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int cod, quant;

        System.out.print("Digite o código do seu lanche: ");
        cod = input.nextInt();

        System.out.print("Digite a quantidade de seu lanche: ");
        quant = input.nextInt();
       
        if (cod == 1){
            System.out.println("Total: R$" + (quant * 4.00));
        
        }
        else{
            if (cod == 2){
                System.out.println("Total: R$" + (quant * 4.50));
            }
            else{
                if (cod == 3){
                    System.out.println("Total: R$" + (quant * 5.00));
                }
                else{
                    if (cod == 4){
                        System.out.println("Total: R$" + (quant * 2.00));
                    }
                    else{
                        if (cod == 5) {
                            System.out.println("Total: R$" + (quant * 1.50));
                        }
                    }
                }
            }
        }
        input.close();
    }
    
}
