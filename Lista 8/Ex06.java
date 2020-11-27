import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n = -1;

        while (n < 0 || n > 15) {
            System.out.print("Informe o número de posições: ");
            n = entrada.nextInt();

            if (n < 0 || n > 15) {
                System.out.println("Valor inválido");
            }
        }

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, n);
            a[i] = entrada.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, n);
            b[i] = entrada.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                System.out.printf("Os elementos são iguais no índice: %d\n", i);
            }
        }

        entrada.close();
    }
}
