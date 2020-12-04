import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = entrada.nextInt();

        int [][] a =  new int[n + 1][m + 1];
        entrada.close();

        for (int i = 0; i < n + 1; i++) {
            int somaLinha = 0;

            for (int j = 0; j < m + 1; j++) {
                if (j < m && i < n) {
                    a[i][j] = (int) (Math.random() * 10);
                    somaLinha += a[i][j];
                } else {
                    a[i][j] = somaLinha;
                }
            }
        }

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i < n) {
                    a[n][j] += a[i][j];
                }
            }
        }

        a[n][m] = 0;
        
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == j && i < n && j < m) {
                    a[n][m] += a[i][j];
                }
            }
        }

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                System.out.printf("[ %d ]\t", a[i][j]);
            }
            System.out.println();
        }
    }
}
