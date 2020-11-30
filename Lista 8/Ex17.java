import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos: ");
        int n = entrada.nextInt();
        entrada.close();

        int[] x = new int[n];

        for (int i = 1, contador = 0; contador < n; i++) {
            boolean ehPrimo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo && i != 1) {
                x[contador] = i;
                contador++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("X[%d/%d] = %d\n", i + 1, n, x[i]);
        }
    }
}
