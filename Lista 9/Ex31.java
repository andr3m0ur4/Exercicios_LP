import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = entrada.nextInt();

        int [][] a =  new int[n][m];

        System.out.print("Digite o valor inicial: ");
        int valorInicial = entrada.nextInt();

        System.out.print("Digite o valor final: ");
        int valorFinal = entrada.nextInt();
        entrada.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (Math.random() * (valorFinal - valorInicial) + valorInicial);
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
