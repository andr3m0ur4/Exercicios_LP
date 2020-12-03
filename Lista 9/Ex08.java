import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = entrada.nextInt();
        entrada.close();
        int [][] f =  new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                f[i][j] = (int) (Math.random() * 100);
            }
        }

        int qtdPares = 0, qtdImpares = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (f[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }

        int [] par = new int[0];
        int [] impar = new int[0];
        if (qtdPares > 0) {
            par = new int[qtdPares];
        }
        if (qtdImpares > 0) {
            impar = new int[qtdImpares];
        }
        qtdPares = 0;
        qtdImpares = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (f[i][j] % 2 == 0) {
                    par[qtdPares] = f[i][j];
                    qtdPares++;
                } else {
                    impar[qtdImpares] = f[i][j];
                    qtdImpares++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]\t", f[i][j]);
            }
            System.out.println();
        }

        if (qtdPares > 0) {
            System.out.println("\nPares:");
            for (int i = 0; i < par.length; i++) {
                System.out.printf("[ %d ]\t", par[i]);
            }
        }

        if (qtdImpares > 0) {
            System.out.println("\n\nImpares:");
            for (int i = 0; i < impar.length; i++) {
                System.out.printf("[ %d ]\t", impar[i]);
            }
        }
    }
}
