import java.util.Scanner;

public class Macas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número de maças compradas: ");
        int macas = entrada.nextInt();

        if (macas < 12) {
            System.out.printf("Total da compra: R$ %.2f\n", macas * 1.3);
        } else {
            System.out.printf("Total da compra: R$ %.2f\n", macas * 1.0);
        }

        entrada.close();

    }
}
