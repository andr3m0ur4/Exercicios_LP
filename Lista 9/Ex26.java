import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = entrada.nextInt();
        entrada.close();

        int [][] w =  new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                w[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]", w[i][j]);
            }
            System.out.println();
        }

        int[] auxiliar = new int[n * m];
        int contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                auxiliar[contador] = w[i][j];
                contador++;
            }
        }

        for (int i = 0; i < auxiliar.length; i++) {
            for (int j = 0; j < auxiliar.length; j++) {
                if (auxiliar[i] >= auxiliar[j]) {
                    int x = auxiliar[i];
                    auxiliar[i] = auxiliar[j];
                    auxiliar[j] = x;
                }
            }
        }

        contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                w[i][j] = auxiliar[contador];
                contador++;
            }
        }

        System.out.println("-----------------------------------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]", w[i][j]);
            }
            System.out.println();
        }
    }
}
