import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o termo inicial da sequencia de Fibonacci: ");
        int termoInicial = entrada.nextInt();
        System.out.print("Digite o termo final da sequencia de Fibonacci: ");
        int termoFinal = entrada.nextInt();

        int a = 0, b = 1;

        for (int i = 0; i < termoFinal; i++) {
            if (i == 0) {
                if (termoInicial == 1) {
                    System.out.printf("%d, ", a);
                }
            } else if (i == 1) {
                if (termoInicial <= 2) {
                    System.out.printf("%d, ", b);
                }
            } else {
                int c = a + b;
                a = b;
                b = c;

                if (i + 1 >= termoInicial && i <= termoFinal) {
                    System.out.printf("%d, ", c);
                }
            }
        }

        entrada.close();
    }
}
