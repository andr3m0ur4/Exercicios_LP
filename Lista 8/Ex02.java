import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] b = new int[15];

        for (int i = 0; i < b.length; i++) {
            System.out.printf("Digite um número[%d/15]: ", i + 1);
            b[i] = entrada.nextInt();
        }

        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");
        }

        entrada.close();
    }
}
