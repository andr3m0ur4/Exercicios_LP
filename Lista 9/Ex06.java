import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = entrada.nextInt();

        int [][] a =  new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (Math.random() * 25);
            }
        }

        System.out.print("Digite um valor: ");
        int valor = entrada.nextInt();

        entrada.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]\t", a[i][j]);
            }
            System.out.println();
        }

        boolean existe = false;
        int linha, coluna, ocorrencias = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (valor == a[i][j]) {
                    existe = true;
                    linha = i + 1;
                    coluna = j + 1;
                    ocorrencias++;
                    System.out.printf("Linha: %d - Coluna: %d\n", linha, coluna);
                }
            }
        }

        if (existe) {
            System.out.println("Quantidade de ocorrencias: " + ocorrencias);
        }
    }
}
