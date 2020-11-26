import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = entrada.nextInt();
        boolean validacao = false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                validacao = true;
                break;
            }
        }

        if (!validacao && num != 1 && num != 0 && num != -1) {
            System.out.printf("%d eh primo!", num);
        } else {
            System.out.printf("%d nao eh primo!", num);
        }

        entrada.close();
    }
}
