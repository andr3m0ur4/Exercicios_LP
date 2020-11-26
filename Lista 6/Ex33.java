import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int termos = 0;
        int contador = 0;

        do {
            if (termos <= 0) {
                System.out.print("Digite a quantidade de termos: ");
                termos = entrada.nextInt();

                if (termos < 0) continue;

                if (termos == 0) break;
            }

            if (contador % 2 != 0) {
                System.out.printf("%d, ", contador);
                termos--;
            }
            contador++;
            
        } while (termos != 0);

        entrada.close();
    }
}
