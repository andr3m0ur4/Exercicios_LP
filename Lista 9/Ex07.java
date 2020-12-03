import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = entrada.nextInt();
        entrada.close();
        int [][] e =  new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                e[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]\t", e[i][j]);
            }
            System.out.println();
        }

        int maior = 0, menor = 0;
        int linhaMenor = 0, colunaMenor = 0, linhaMaior = 0, colunaMaior = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    menor = e[i][j];
                    linhaMenor = i + 1;
                    colunaMenor = j + 1;
                } else if (e[i][j] < menor) {
                    menor = e[i][j];
                    linhaMenor = i + 1;
                    colunaMenor = j + 1;
                }

                if (e[i][j] > maior) {
                    maior = e[i][j];
                    linhaMaior = i + 1;
                    colunaMaior = j + 1;
                }
            }
        }

        System.out.println("Maior elemento: " + maior);
        System.out.printf("Linha: %d - Coluna: %d\n", linhaMaior, colunaMaior);
        System.out.println("Menor elemento: " + menor);
        System.out.printf("Linha: %d - Coluna: %d\n", linhaMenor, colunaMenor);
    }
}
