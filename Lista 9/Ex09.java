import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a dimensao: ");
        int n = entrada.nextInt();
        entrada.close();
        int [][] g =  new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.printf("[ %d ]\t", g[i][j]);
                } else {
                    System.out.printf("[  ]\t");
                }
            }
            System.out.println();
        }
    }
}
