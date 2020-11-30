import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] p = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 10);
            p[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("P[%d/%d] = %d\n", i + 1, 10, p[i]);
        }

        int[] q = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 15);
            q[i] = entrada.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            System.out.printf("Q[%d/%d] = %d\n", i + 1, 15, q[i]);
        }

        entrada.close();

        int[] r = new int[25];

        for (int i = 0; i < 10; i++) {
            r[i] = p[i];
        }

        for (int i = 0; i < 15; i++) {
            r[i + 10] = q[i];
        }

        for (int i = 0; i < 25; i++) {
            System.out.printf("R[%d/25] = %d\n", i + 1, r[i]);
        }
    }
}
