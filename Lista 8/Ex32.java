import java.util.Arrays;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Frase: ");
        String frase = entrada.nextLine();
        entrada.close();
        String[] an = frase.split(" ");
        int quantidade = an.length;

        System.out.print("Vetor AN ");
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("\"%s\", ", an[i]);
        }

        Arrays.sort(an);

        System.out.print("\nVetor AN ");
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("\"%s\", ", an[i]);
        }
    }
}
