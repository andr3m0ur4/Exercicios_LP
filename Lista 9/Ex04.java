import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n = 0, m = 0;

        while (n < 1) {
            System.out.print("Digite a quantidade de linhas: ");
            n = entrada.nextInt();
        }
        while (m < 1) {
            System.out.print("Digite a quantidade de colunas: ");
            m = entrada.nextInt();
        }
        System.out.print("Digite o valor maximo para os elementos aleatorios: ");
        int numero = entrada.nextInt();

        int [][] d =  new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                d[i][j] = (int) (Math.random() * numero);
            }
        }

        entrada.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]\t", d[i][j]);
            }
            System.out.println();
        }
    }
}
