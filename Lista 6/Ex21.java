import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade: ");
        int qtd = entrada.nextInt();
        int maior = 0;
        int soma = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite um numero: ");
            int numero = entrada.nextInt();
            soma += numero;

            if (i == 0) {
                maior = numero;
            }

            if (numero > maior) {
                maior = numero;
            }
        }

        double media = (double) soma / qtd;

        System.out.println("Maior numero lido = " + maior);
        System.out.println("Medias dos numeros lidos = " + media);

        entrada.close();

    }
}
