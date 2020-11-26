import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite termo inicial: ");
        int termoInicial = entrada.nextInt();
        System.out.print("Digite a quantidade de termos: ");
        int quantidade = entrada.nextInt();

        for (int i = termoInicial, contador = 0; contador < quantidade; i++) {
            boolean validacao = false;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    validacao = true;
                    break;
                }
            }

            if (!validacao && i != 1 && i != 0 && i != -1) {
                System.out.printf("%d, ", i);
                contador++;
            }
        }

        entrada.close();
    }
}
