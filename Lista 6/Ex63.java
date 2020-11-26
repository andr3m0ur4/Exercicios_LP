import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos: ");
        int termos = entrada.nextInt();
        int fibonacci1 = 1;
        int fibonacci2 = 1;
        int denominador = 2;
        double somaTermos = 0;

        for (int i = 0; i < termos; i++) {
            double soma = 0;
            int numerador = 1;
            
            if (i > 1) {
                numerador = fibonacci1 + fibonacci2;
                fibonacci1 = fibonacci2;
                fibonacci2 = numerador;
            }

            for (int j = 2; j < denominador; j++) {
                if (denominador % j == 0) {
                    denominador++;
                    j = 1;
                    continue;
                }
            }

            if (i == 0) {
                soma += numerador / (double) denominador;
            } else {
                soma += numerador / (double) denominador;
            }
            
            System.out.printf("%d / %d + ", numerador, denominador);

            denominador++;

            somaTermos += soma;
        }

        System.out.printf("\nSoma dos termos = %.2f\n", somaTermos);

        entrada.close();
    }
}
