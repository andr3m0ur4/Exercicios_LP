import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] ae = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 10);
            ae[i] = entrada.nextInt();
        }

        entrada.close();

        for (int i = 0; i < 10; i++) {
            if (ae[i] % 2 != 0) {
                for (int j = 0; j < 10; j++) {
                    if (ae[j] % 2 != 0) {
                        if (ae[i] >= ae[j]) {
                            int x = ae[i];
                            ae[i] = ae[j];
                            ae[j] = x;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("AE[%d/%d] = %d\n", i + 1, 10, ae[i]);
        }
    }
}
