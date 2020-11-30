import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos: ");
        int n = entrada.nextInt();
        entrada.close();

        int[] y = new int[n];

        for (int i = 1; i <= n; i++) {
            int fatorial = 1;

            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }

            y[i - 1] = fatorial;
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Y[%d/%d] = %d\n", i + 1, n, y[i]);
        }
    }
}
