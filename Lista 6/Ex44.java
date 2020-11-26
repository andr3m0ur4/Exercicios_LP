import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int termos = entrada.nextInt();

        for (int i = 1; i <= termos; i++) {
            int fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.printf("Fatorial de %d = %d\n", i, fatorial);
        }

        entrada.close();
    }
}
