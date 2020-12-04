import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = entrada.nextInt();
        entrada.close();

        int [][] a =  new int[n][m];
        int num1 = 0, num2 = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    a[i][j] = num1;
                } else {
                    a[i][j] = num1 + num2;
                    num2 = num1;
                    num1 = a[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]", a[i][j]);
            }
            System.out.println();
        }
    }
}
