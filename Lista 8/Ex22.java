import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos: ");
        int n = entrada.nextInt();

        int[] ac = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, n);
            ac[i] = entrada.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("AC[%d/%d] = %d\n", i + 1, n, ac[i]);
        }

        int posicoes = n + 1;
        while (posicoes > n) {
            System.out.print("Digite o número de posições: ");
            posicoes = entrada.nextInt();
        }

        System.out.print("Digite o número máximo para o tamanho dos elementos: ");
        int numeroMaximo = entrada.nextInt();
        entrada.close();

        for (int i = 0; i < posicoes; i++) {
            ac[i] = (int) (Math.random() * numeroMaximo);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("AC[%d/%d] = %d\n", i + 1, n, ac[i]);
        }
    }
}
