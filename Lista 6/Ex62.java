import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos: ");
        int termos = entrada.nextInt();
        int numerador = 2;
        int denominador = 1;
        double somaTermos = 0;

        for (int i = 0; i < termos; i++) {
            double soma = 0;
            soma += numerador / (double) denominador;

            numerador += 2;
            denominador += 2;

            System.out.printf("%.2f ", soma);

            if (i % 2 == 0) {
                somaTermos += soma;
            } else {
                somaTermos -= soma;
            }
        }

        System.out.printf("\nSoma dos termos = %.2f\n", somaTermos);

        entrada.close();
    }
}
