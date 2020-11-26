import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Digite um número: ");
            n = entrada.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        entrada.close();

    }
}
