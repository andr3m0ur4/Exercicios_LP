import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int termos = entrada.nextInt();

        for (int i = 1, contador = 0; contador < termos; i++) {
            int soma = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    soma += j;
                }
            }

            if (i == soma) {
                System.out.printf("%d, ", i);
                contador++;
            }
        }

        entrada.close();
    }
}
