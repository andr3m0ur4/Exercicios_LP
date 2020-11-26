import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int n = entrada.nextInt();

            if (n < 0) {
                contador++;
            }
        }

        System.out.printf("%d números são negativos\n", contador);

        entrada.close();

    }
}
