import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos: ");
        int n = entrada.nextInt();
        entrada.close();

        int[] v = new int[n];
        int num1 = 0, num2 = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                v[i] = num1;
            } else if (i == 1) {
                v[i] = num2;
            } else {
                v[i] = num1 + num2;
                num1 = num2;
                num2 = v[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("V[%d/%d] = %d\n", i + 1, n, v[i]);
        }
    }
}
