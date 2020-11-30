import java.util.Arrays;
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);

        System.out.print("Quantidade de elementos do vetor AM: ");
        int n = entrada.nextInt();
        String[] am = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite uma palavra ou frase: ");
            am[i] = texto.nextLine();
        }

        entrada.close();
        texto.close();

        System.out.print("Vetor AK ");
        for (int i = 0; i < n; i++) {
            System.out.printf("\"%s\", ", am[i]);
        }

        Arrays.sort(am);

        System.out.print("\nVetor AK ");
        for (int i = 0; i < n; i++) {
            System.out.printf("\"%s\", ", am[i]);
        }
    }
}
