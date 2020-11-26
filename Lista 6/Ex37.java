import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int termos = 0;
        int contador = 1;
        double denominador = 1.0;

        do {
            if (termos <= 0) {
                System.out.print("Digite a quantidade de termos: ");
                termos = entrada.nextInt();

                if (termos < 0) continue;

                if (termos == 0) break;
            }

            if (denominador > 1) {
                System.out.printf("%.2f, ", contador / denominador);
                contador++;
            } else {
                System.out.printf("%d, ", contador);
            }

            denominador++;
            termos--;
            
        } while (termos != 0);

        entrada.close();
    }
}
