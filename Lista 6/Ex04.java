import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        entrada.close();

    }
}
