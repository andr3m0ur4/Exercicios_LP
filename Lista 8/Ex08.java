import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] f = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 5);
            f[i] = entrada.nextInt();
        }

        int soma = 0;
        boolean flag = false;

        for (int i = 0; i < 5; i++) {
            if (f[i] % 2 != 0) {
                soma += f[i];
                flag = true;
            }
        }
        
        if (!flag) {
            System.out.println("Todos os elemntos são pares");
        } else {
            System.out.printf("Soma dos elementos ímpares: %d\n", soma);
        }

        entrada.close();
    }
}
