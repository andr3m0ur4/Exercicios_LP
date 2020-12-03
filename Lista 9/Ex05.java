import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = entrada.nextInt();

        int [][] a =  new int[n][m];
        int [][] b =  new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = (int) (Math.random() * 100);
            }
        }

        entrada.close();
        int [][] c =  new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]\t", a[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]\t", b[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]\t", c[i][j]);
            }
            System.out.println();
        }
    }
}
