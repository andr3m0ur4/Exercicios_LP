import java.util.Arrays;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = entrada.nextInt();
        entrada.close();

        int [][] x =  new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]", x[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            Arrays.sort(x[i]);
        }

        System.out.println("-----------------------------------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]", x[i][j]);
            }
            System.out.println();
        }
    }
}
