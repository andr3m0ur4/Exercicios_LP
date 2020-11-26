import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int intervalo = 0;
        int foraIntervalo = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int n = entrada.nextInt();

            if (n >= 10 && n <= 20) {
                intervalo++;
            } else {
                foraIntervalo++;
            }
        }

        System.out.printf("%d estão no intervalo de [10,20]\n", intervalo);
        System.out.printf("%d estão fora do intervalo de [10,20]\n", foraIntervalo);

        entrada.close();

    }
}
