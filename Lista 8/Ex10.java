import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] pa = new int[5];
        int[] pb = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 5);
            pa[i] = entrada.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 5);
            pb[i] = entrada.nextInt();
        }

        entrada.close();

        for (int i = 0; i < 5; i++) {
            System.out.printf("PA[%d/5] = %d\nPB[%d/5] = %d\n", i + 1, pa[i], i + 1, pb[i]);
        }

        int[] pc = new int[10];

        for (int i = 0; i < 5; i++) {
            pc[i] = pa[i];
            pc[i + 5] = pb[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("PC[%d/10] = %d\n", i + 1, pc[i]);
        }
    }
}
