import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] s = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 10);
            s[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("S[%d/%d] = %d\n", i + 1, 10, s[i]);
        }

        int[] t = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 15);
            t[i] = entrada.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            System.out.printf("T[%d/%d] = %d\n", i + 1, 15, t[i]);
        }

        entrada.close();

        int[] u = new int[25];

        for (int i = 0; i < 10; i++) {
            u[i * 2] = t[i];
            u[i * 2 + 1] = s[i];
        }

        for (int i = 0; i < 5; i++) {
            u[i + 20] = t[i + 10];
        }

        for (int i = 0; i < 25; i++) {
            System.out.printf("U[%d/%d] = %d\n", i + 1, 25, u[i]);
        }
    }
}
