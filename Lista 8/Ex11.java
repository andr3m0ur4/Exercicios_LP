import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] qa = new int[5];
        int[] qb = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 5);
            qa[i] = entrada.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 5);
            qb[i] = entrada.nextInt();
        }

        entrada.close();

        for (int i = 0; i < 5; i++) {
            System.out.printf("PA[%d/5] = %d\nPB[%d/5] = %d\n", i + 1, qa[i], i + 1, qb[i]);
        }

        int[] qc = new int[10];

        for (int i = 0; i < 5; i++) {
            qc[i * 2] = qa[i];
            qc[i * 2 + 1] = qb[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("PC[%d/10] = %d\n", i + 1, qc[i]);
        }
    }
}
