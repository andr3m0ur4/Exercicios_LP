import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] af = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 10);
            af[i] = entrada.nextInt();
        }

        entrada.close();

        for (int i = 0; i < 10; i++) {
            if (af[i] % 2 == 0) {
                for (int j = 0; j < 10; j++) {
                    if (af[j] % 2 == 0) {
                        if (af[i] >= af[j]) {
                            int x = af[i];
                            af[i] = af[j];
                            af[j] = x;
                        }
                    }
                }
            } else {
                for (int j = 0; j < 10; j++) {
                    if (af[j] % 2 != 0) {
                        if (af[i] <= af[j]) {
                            int x = af[i];
                            af[i] = af[j];
                            af[j] = x;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("AF[%d/%d] = %d\n", i + 1, 10, af[i]);
        }
    }
}
