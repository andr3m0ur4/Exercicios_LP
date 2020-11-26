import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int termos = entrada.nextInt();
        
        for (int i = 1, contador = 0; contador < termos; i++) {
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
