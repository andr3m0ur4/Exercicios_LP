import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            n += entrada.nextInt();
        }

        System.out.println("Soma dos números: " + n);

        entrada.close();

    }
}
