import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int termos = 0;
        int contador = 1;
        int metade = 0;
        boolean validador = false;
        boolean original = false;

        do {
            if (termos <= 0) {
                System.out.print("Digite a quantidade de termos: ");
                termos = entrada.nextInt();

                if (termos < 0) continue;

                if (termos == 0) break;

                metade = termos / 2;

                original = (termos % 2 == 0);
            }

            if (contador <= metade && !validador) {
                System.out.printf("%d, ", contador++);
            } else {
                validador = true;
                System.out.printf("%d, ", contador-- - (original ? 1 : 0));
            }

            termos--;
            
        } while (termos != 0);

        entrada.close();
    }
}
