import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = entrada.nextInt();
        boolean validador = false;

        for (int i = 1; i <= num; i++) {
            int soma = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    soma += j;
                }
            }

            if (num == soma) {
                validador = true;
                break;
            }
        }

        if (validador) {
            System.out.println("Numero eh perfeito");
        } else {
            System.out.println("Numero nao eh perfeito");
        }

        entrada.close();
    }
}
