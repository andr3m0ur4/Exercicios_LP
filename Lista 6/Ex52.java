import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = entrada.nextInt();

        int a = 0, b = 1;
        boolean validador = false;

        for (int i = 0; i < num; i++) {
            int c = a + b;
            a = b;
            b = c;
            validador = num == c;

            if (validador) break;
        }

        if (validador || num == 0 || num == 1) {
            System.out.println(num + " pertence a sequencia de Fibonacci");
        } else {
            System.out.println(num + " nao pertence a sequencia de Fibonacci");
        }

        entrada.close();
    }
}
