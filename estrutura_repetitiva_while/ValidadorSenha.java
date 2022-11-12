package estrutura_repetiva;
import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.print("Digite a sua senha: ");
        int senha = input.nextInt();

        while (senha != 2002){
            System.out.print("Por favor, digite uma senha válida: ");
            senha = input.nextInt();
        }
        System.out.println("Logado com sucesso!");

        input.close();
        

    }
}
