import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int p = entrada.nextInt();
        entrada.close();

        int [][] a =  new int[n][m];
        int [][] b =  new int[n][p];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                b[i][j] = (int) (Math.random() * 100);
            }
        }

        int [][] c =  new int[n][m + p];
        
        for (int i = 0; i < n; i++) {
            int contador = 0;

            for (int j = 0; j < c[i].length; j++) {
                if (m > p) {
                    if (contador < p) {
                        if (j % 2 == 0) {
                            c[i][j] = a[i][contador];
                        } else {
                            c[i][j] = b[i][contador];
                            contador++;
                        }
                    } else {
                        c[i][j] = a[i][contador];
                        contador++;
                    }
                } else {
                    if (contador < m) {
                        if (j % 2 == 0) {
                            c[i][j] = a[i][contador];
                        } else {
                            c[i][j] = b[i][contador];
                            contador++;
                        }
                    } else {
                        c[i][j] = b[i][contador];
                        contador++;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]\t", a[i][j]);
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.printf("[ %d ]\t", b[i][j]);
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("[ %d ]\t", c[i][j]);
            }
            System.out.println();
        }
    }
}
