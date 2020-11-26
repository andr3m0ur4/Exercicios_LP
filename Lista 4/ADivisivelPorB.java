import java.util.Scanner;

public class ADivisivelPorB {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = entrada.nextInt();

        if ((a >= 0 && a <= 1000) && (b >= 0 && b <= 20)) {
            if (a >= b) {
                if (a % b == 0) {
                    System.out.print("É divisível");
                } else {
                    System.out.print("Não é divisível");
                }
            } else {
                System.out.print("Valor de a não é maior ou igual a b");
            }
        } else {
            System.out.print("VALOR INVALIDO");
        }

        entrada.close();

    }
}
