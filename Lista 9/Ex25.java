import java.util.Arrays;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = entrada.nextInt();
        entrada.close();

        int [][] y =  new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                y[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]", y[i][j]);
            }
            System.out.println();
        }

        int[] auxiliar = new int[n * m];
        int contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                auxiliar[contador] = y[i][j];
                contador++;
            }
        }

        Arrays.sort(auxiliar);

        contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                y[i][j] = auxiliar[contador];
                contador++;
            }
        }

        System.out.println("-----------------------------------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]", y[i][j]);
            }
            System.out.println();
        }
    }
}
