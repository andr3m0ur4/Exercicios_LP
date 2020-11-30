import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] z = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 10);
            z[i] = entrada.nextInt();
        }

        entrada.close();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (z[i] <= z[j]) {
                    int x = z[i];
                    z[i] = z[j];
                    z[j] = x;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("Z[%d/%d] = %d\n", i + 1, 10, z[i]);
        }
    }
}
