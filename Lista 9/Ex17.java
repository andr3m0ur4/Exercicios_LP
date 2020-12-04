import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a dimensão: ");
        int n = entrada.nextInt();
        entrada.close();
        int [][] q =  new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                q[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j && i + j >= n - 1) {
                    System.out.printf("[ %d ]\t", q[i][j]);
                } else {
                    System.out.printf("[  ]\t");
                }
            }
            System.out.println();
        }
    }
}
