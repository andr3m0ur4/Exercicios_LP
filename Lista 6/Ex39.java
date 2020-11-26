import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int termos = 0;
        int contador = 1;
        double somaFinal = 0;
        double soma = 0;

        do {
            if (termos <= 0) {
                System.out.print("Digite a quantidade de termos: ");
                termos = entrada.nextInt();

                if (termos < 0) continue;

                if (termos == 0) break;
            }

            soma += (double) contador / termos;

            if (contador % 2 == 0) {
                System.out.printf("%.2f, ", soma);
                somaFinal += soma;
                soma = 0;
            }

            contador++;
            termos--;
            
        } while (termos != 0);

        System.out.println("\nSoma: " + somaFinal);

        entrada.close();
    }
}
