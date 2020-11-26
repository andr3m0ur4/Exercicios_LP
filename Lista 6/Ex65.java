import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos: ");
        int termos = entrada.nextInt();
        
        int denominador = 2;
        double somaTermos = 0;

        for (int i = 0; i < termos; i++) {
            double soma = 0;
            int numerador = 1;

            if (i > 0) {
                for (int j = 1; j <= i; j++) {
                    numerador *= j;
                }
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

            if (i % 2 == 0) {
                System.out.printf("%d / %d + ", numerador, denominador);
                somaTermos -= soma;
            } else {
                System.out.printf("%d / %d - ", numerador, denominador);
                somaTermos += soma;
            }

            denominador++;
        }

        System.out.printf("\nSoma dos termos = %.2f\n", somaTermos);

        entrada.close();
    }
}
