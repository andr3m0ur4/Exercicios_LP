import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos: ");
        int n = entrada.nextInt();

        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, n);
            s[i] = entrada.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("S[%d/%d] = %d\n", i + 1, n, s[i]);
        }

        System.out.print("Digite a quantidade de elementos: ");
        int m = entrada.nextInt();

        int[] t = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, m);
            t[i] = entrada.nextInt();
        }

        for (int i = 0; i < m; i++) {
            System.out.printf("T[%d/%d] = %d\n", i + 1, m, t[i]);
        }

        entrada.close();

        int[] u = new int[n + m];

        if (n < m) {
            for (int i = 0; i < n; i++) {
                u[i * 2] = t[i];
                u[i * 2 + 1] = s[i];
            }

            for (int i = 0; i < m - n; i++) {
                u[i + n * 2] = t[i + n];
            }
        } else {
            for (int i = 0; i < m; i++) {
                u[i * 2] = s[i];
                u[i * 2 + 1] = t[i];
            }

            for (int i = 0; i < n - m; i++) {
                u[i + m * 2] = s[i + m];
            }
        }

        for (int i = 0; i < u.length; i++) {
            System.out.printf("U[%d/%d] = %d\n", i + 1, u.length, u[i]);
        }
    }
}
