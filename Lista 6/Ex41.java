import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int fatorial = 1;
        
        System.out.print("Digite um numero: ");
        int num = entrada.nextInt();

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial = " + fatorial);

        entrada.close();
    }
}
