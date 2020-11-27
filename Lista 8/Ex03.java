import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o número de posições: ");
        int n = entrada.nextInt();

        int[] c = new int[n];

        for (int i = 0; i < c.length; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, n);
            c[i] = entrada.nextInt();
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        entrada.close();
    }
}
