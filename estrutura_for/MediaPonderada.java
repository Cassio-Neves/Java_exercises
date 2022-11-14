package estrutura_for;
import java.util.Scanner;
import java.util.Locale;

public class MediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de casos: ");
        int n = input.nextInt();

        

        for (int i=0; i<=n; i++){
            double media = 0;
            System.out.print("Digite um valor a decimal: ");
            double a = input.nextDouble();
            System.out.print("Digite um valor b decimal: ");
            double b = input.nextDouble();
            System.out.print("Digite um valor c decimal: ");
            double c = input.nextDouble();

            media = (a * 2.0 + b* 3.0 +c * 5.0 )/10;
            System.out.printf("%.1f\n", media);
        }

        input.close();
    }
    
}
