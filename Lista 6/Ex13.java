import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int n = entrada.nextInt();

            if (n < 40) {
                soma += n;
            }
        }

        System.out.println("Soma dos números inferiores a 40 = " + soma);

        entrada.close();

    }
}
