import java.util.Arrays;
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de elementos do vetor AK: ");
        int n = entrada.nextInt();
        double[] ak = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, n);
            ak[i] = entrada.nextDouble();
        }
        entrada.close();

        System.out.print("Vetor AK ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f, ", ak[i]);
        }

        Arrays.sort(ak);

        System.out.print("\nVetor AK ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f, ", ak[i]);
        }

        double[] al = new double[n * 2 - 1];

        for (int i = 0; i < al.length; i++) {
            if (i % 2 == 0) {
                al[i] = ak[i / 2];
            } else {
                al[i] = (ak[i / 2] + ak[(i + 1) / 2]) / 2.0;
            }
        }

        System.out.print("\nVetor AL ");
        for (int i = 0; i < al.length; i++) {
            System.out.printf("%.1f, ", al[i]);
        }
    }
}
