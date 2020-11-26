import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro termo: ");
        int a = entrada.nextInt();

        System.out.print("Digite o segundo termo: ");
        int b = entrada.nextInt();

        System.out.printf("%d, %d, ", a, b);

        for (int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.printf("%d, ", c);
            a = b;
            b = c;
        }

        entrada.close();
    }
}
