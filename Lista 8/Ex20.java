import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] aa = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 10);
            aa[i] = entrada.nextInt();
        }

        entrada.close();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (aa[i] >= aa[j]) {
                    int x = aa[i];
                    aa[i] = aa[j];
                    aa[j] = x;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("AA[%d/%d] = %d\n", i + 1, 10, aa[i]);
        }
    }
}
