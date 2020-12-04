import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = entrada.nextInt();
        entrada.close();

        int [][] a =  new int[n][m];
        int primo = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; primo++) {
                boolean ehPrimo = true;

                for (int p = 2; p < primo; p++) {
                    if (primo % p == 0) {
                        ehPrimo = false;
                        break;
                    }
                }

                if (ehPrimo) {
                    a[i][j] = primo;
                    j++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]\t", a[i][j]);
            }
            System.out.println();
        }
    }
}
