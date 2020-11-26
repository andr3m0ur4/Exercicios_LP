import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int a = entrada.nextInt();
        System.out.print("Digite outro numero: ");
        int b = entrada.nextInt();
        int soma = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                soma += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                soma += i;
            }
        }

        System.out.println("Soma dos numeros = " + soma);

        entrada.close();

    }
}
