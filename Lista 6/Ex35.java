import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int termos = 0;
        int contador = 1;
        byte validador = 0;

        do {
            if (termos <= 0) {
                System.out.print("Digite a quantidade de termos: ");
                termos = entrada.nextInt();

                if (termos < 0) continue;

                if (termos == 0) break;
            }

            if (validador == 0) {
                System.out.printf("%d, ", contador);
                validador = 1;
            } else {
                System.out.printf("%d, ", -contador);
                validador = 0;
                contador++;
            }

            termos--;
            
        } while (termos != 0);

        entrada.close();
    }
}
