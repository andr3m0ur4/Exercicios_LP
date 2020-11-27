import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] a = new int[15];

        for (int i = 0; i < a.length; i++) {
            System.out.printf("Digite um número[%d/15]: ", i + 1);
            a[i] = entrada.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            System.out.print(a[i] + " ");
        }

        entrada.close();
    }
}
