import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite um numero: ");
            int num = entrada.nextInt();
            int fatorial = 1;

            for (int j = 1; j <= num; j++) {
                fatorial *= j;
            }

            System.out.printf("Fatorial de %d = %d\n\n", num, fatorial);
        }

        entrada.close();
    }
}
