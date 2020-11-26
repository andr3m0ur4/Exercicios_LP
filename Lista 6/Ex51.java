import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequencia de Fibonacci: ");
        int termos = entrada.nextInt();

        int a = 0, b = 1;

        for (int i = 0; i < termos; i++) {
            if (i == 0) {
                System.out.printf("%d, ", a);
            } else if (i == 1) {
                System.out.printf("%d, ", b);
            } else {
                int c = a + b;
                a = b;
                b = c;
                System.out.printf("%d, ", c);
            }
        }

        entrada.close();
    }
}
