import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos: ");
        int n = entrada.nextInt();

        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, n);
            p[i] = entrada.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("P[%d/%d] = %d\n", i + 1, n, p[i]);
        }

        System.out.print("Digite a quantidade de elementos: ");
        int m = entrada.nextInt();

        int[] q = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, m);
            q[i] = entrada.nextInt();
        }

        for (int i = 0; i < m; i++) {
            System.out.printf("Q[%d/%d] = %d\n", i + 1, m, q[i]);
        }

        entrada.close();

        int[] r = new int[n + m];

        for (int i = 0; i < n; i++) {
            r[i] = p[i];
        }

        for (int i = 0; i < m; i++) {
            r[i + n] = q[i];
        }

        for (int i = 0; i < r.length; i++) {
            System.out.printf("R[%d/%d] = %d\n", i + 1, r.length, r[i]);
        }
    }
}
