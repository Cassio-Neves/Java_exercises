package src;
import java.util.Scanner;

public class ex4 {
    
    public static void main(String[] args){

            Scanner input = new Scanner(System.in);

        int codigo, horas;
        double valor_hora;

        System.out.print("Digite o seu código: ");
        codigo = input.nextInt();

        System.out.print("Digite as suas horas trabalhadas: ");
        horas = input.nextInt();

        System.out.println("Digite o valor de cada hora de trabalho: ");
        valor_hora = input.nextDouble();

        System.out.println("Código do funcionário: " + codigo);
        System.out.println("Salário: "+ horas * valor_hora);

            input.close();
    }
}
