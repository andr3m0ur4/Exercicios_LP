import java.util.Scanner;

public class VerificaValorProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro produto: ");
        int precoProduto1 = entrada.nextInt();
        System.out.print("Digite o valor do segundo produto: ");
        int precoProduto2 = entrada.nextInt();

        if ((precoProduto1 >= 1 && precoProduto1 <= 1000) && (precoProduto2 >= 1 && precoProduto2 <= 1000)) {
            if (precoProduto1 < precoProduto2) {
                System.out.println("O produto 1 é o mais barato");
            } else if (precoProduto2 < precoProduto1) {
                System.out.println("O produto 2 é o mais barato");
            } else {
                System.out.println("Os preços dos dois produtos são iguais");
            }
        } else {
            System.out.println("VALOR INVALIDO");
        }

        entrada.close();

    }
}
