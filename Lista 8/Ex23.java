import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] ad = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, 10);
            ad[i] = entrada.nextInt();
        }

        entrada.close();

        for (int i = 0; i < 10; i++) {
            if (ad[i] % 2 == 0) {
                for (int j = 0; j < 10; j++) {
                    if (ad[j] % 2 == 0) {
                        if (ad[i] <= ad[j]) {
                            int x = ad[i];
                            ad[i] = ad[j];
                            ad[j] = x;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("AD[%d/%d] = %d\n", i + 1, 10, ad[i]);
        }
    }
}
