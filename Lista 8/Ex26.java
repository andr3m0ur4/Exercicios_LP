import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] ag = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 10);
            ag[i] = entrada.nextInt();
        }

        entrada.close();

        for (int i = 0; i < 10; i++) {
            boolean ehPrimo = true;

            for (int j = 2; j < ag[i]; j++) {
                if (ag[i] % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            
            for (int j = 0; j < 10; j++) {
                if (ehPrimo && ag[i] != 1) {
                    if (ag[i] <= ag[j]) {
                        int x = ag[i];
                        ag[i] = ag[j];
                        ag[j] = x;
                    }
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("AG[%d/%d] = %d\n", i + 1, 10, ag[i]);
        }
    }
}
