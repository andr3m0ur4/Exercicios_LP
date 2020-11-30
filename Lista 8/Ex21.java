import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] ab = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 10);
            ab[i] = entrada.nextInt();
        }

        entrada.close();

        for (int i = 0; i < 10; i++) {
            if (ab[i] % 2 != 0) {
                ab[i] *= 2;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("AB[%d/%d] = %d\n", i + 1, 10, ab[i]);
        }
    }
}
