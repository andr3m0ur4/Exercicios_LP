import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean validador = false;

        System.out.print("Digite o primeiro termo: ");
        int a = entrada.nextInt();

        System.out.print("Digite o segundo termo: ");
        int b = entrada.nextInt();

        System.out.print("Digite  um numero: ");
        int num = entrada.nextInt();

        for (int i = 2; i <= num; i++) {
            int c = a + b;
            a = b;
            b = c;

            if (num == c) {
                validador = true;
                break;
            }
        }

        if (validador) {
            System.out.println("Pertence a sequencia de Ricci");
        } else {
            System.out.println("Nao pertence a sequencia de Ricci");
        }

        entrada.close();
    }
}
