import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] g = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 5);
            g[i] = entrada.nextInt();
        }

        entrada.close();
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            if (g[i] % 2 == 0) contador++;
        }

        if (contador > 0) {
            int[] h = new int[contador];
            contador = 0;

            for (int i = 0; i < 5; i++) {
                if (g[i] % 2 == 0) {
                    h[contador] = g[i];
                    contador++;
                }
            }

            for (int i = 0; i < h.length; i++) {
                System.out.println(h[i]);
            }
        } else {
            System.out.println("Todos os elemntos são ímpares");
        }
    }
}
