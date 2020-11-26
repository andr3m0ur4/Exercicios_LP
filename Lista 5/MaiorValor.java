import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = entrada.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = entrada.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor1);
        } else {
            System.out.println(valor2);
        }

        entrada.close();

    }
}
