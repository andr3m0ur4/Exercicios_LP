import java.util.Arrays;
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = entrada.nextInt();
        entrada.close();

        int [][] z =  new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                z[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]", z[i][j]);
            }
            System.out.println();
        }

        int[] auxiliar = new int[n];

        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < n; j++) {
                auxiliar[j] = z[j][i];
            }

            Arrays.sort(auxiliar);

            for (int j = 0; j < n; j++) {
                z[j][i] = auxiliar[j];
            }
        }

        System.out.println("-----------------------------------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]", z[i][j]);
            }
            System.out.println();
        }
    }
}
