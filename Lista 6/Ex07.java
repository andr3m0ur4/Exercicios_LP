import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n = 0;

        while (n < 1 || n > 10) {
            System.out.print("Digite um número: ");
            n = entrada.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }

        entrada.close();
    }
}
