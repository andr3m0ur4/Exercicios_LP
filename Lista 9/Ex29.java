import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de elementos: ");
        int elementos = entrada.nextInt();
        entrada.close();

        int[] vetor = new int[elementos];

        for (int i = 0; i < elementos; i++) {
            vetor[i] = (int) (Math.random() * 10);
        }

        int[][] matriz = new int[elementos][10];

        for (int i = 0; i < elementos; i++) {
            matriz[i][0] = vetor[i];
            int primo = 2;

            for (int j = 1; j < vetor[i] + 1; primo++) {
                boolean ehPrimo = true;

                for (int p = 2; p < primo; p++) {
                    if (primo % p == 0) {
                        ehPrimo = false;
                        break;
                    }
                }

                if (ehPrimo) {
                    matriz[i][j] = primo;
                    j++;
                }
            }
        }

        System.out.println("Vetor gerado:");
        for (int i = 0; i < elementos; i++) {
            System.out.printf("[ %d ]", vetor[i]);
        }

        System.out.println("\nMatriz gerado:");
        for (int i = 0; i < elementos; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[ %d ]", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
