import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double maior = 0;
        double soma = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o codigo do produto: ");
            int codigo = entrada.nextInt();
            System.out.print("Digite o preco do produto: ");
            double preco = entrada.nextDouble();
            soma += preco;

            if (i == 0) {
                maior = preco;
            }

            if (preco > maior) {
                maior = preco;
            }
        }

        double media = soma / 15;

        System.out.println("MAIOR PRECO LIDO = " + maior);
        System.out.println("MEDIA ARITMETICA = " + media);

        entrada.close();

    }
}
