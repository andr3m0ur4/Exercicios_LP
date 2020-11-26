import java.util.Scanner;

public class Ex61 {
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

            System.out.printf("%d / %d + ", numerador, denominador);

            numerador += 2;
            denominador += 2;
            somaTermos += soma;
        }

        System.out.printf("\nSoma dos termos = %.2f\n", somaTermos);

        entrada.close();
    }
}
