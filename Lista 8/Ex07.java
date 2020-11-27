import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n = -1;

        while (n < 0 || n > 20) {
            System.out.print("Informe o número de posições: ");
            n = entrada.nextInt();

            if (n < 0 || n > 20) {
                System.out.println("Valor inválido");
            }
        }

        int[] e = new int[n];
        int maior = 0, menor = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, n);
            e[i] = entrada.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (e[i] > maior) {
                maior = e[i];
            }

            if (i == 0) {
                menor = e[i];
            } else if (e[i] < menor) {
                menor = e[i];
            }
        }

        System.out.printf("Maior elemento do vetor: %d\n", maior);
        System.out.printf("Menor elemento do vetor: %d\n", menor);

        entrada.close();
    }
}
