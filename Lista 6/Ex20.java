import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int maior = 0, menor = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite um valor: ");
            int valor = entrada.nextInt();

            if (i == 0) {
                maior = valor;
                menor = valor;
            }

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }

        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("MENOR VALOR = " + menor);

        entrada.close();

    }
}
