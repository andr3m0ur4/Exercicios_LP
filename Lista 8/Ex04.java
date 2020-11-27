import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n = -1;

        while (n < 0 || n > 20) {
            System.out.print("Informe o número de posições: ");
            n = entrada.nextInt();

            if (n < 0 || n > 20) {
                System.out.println("Valor inválido");
            }
        }

        int[] d = new int[n];

        for (int i = 0; i < d.length; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, n);
            d[i] = entrada.nextInt();
        }

        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }

        entrada.close();
    }
}
