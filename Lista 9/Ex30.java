import java.util.Scanner;

public class Ex30 {
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
            int num1 = 0, num2 = 1;

            for (int j = 1; j < vetor[i] + 1; j++) {
                if (j == 1) {
                    matriz[i][j] = num1;
                } else {
                    matriz[i][j] = num1 + num2;
                    num2 = num1;
                    num1 = matriz[i][j];
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
