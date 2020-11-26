import java.util.Scanner;

public class CodigoProduto {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$ ");
        double precoProduto = entrada.nextDouble();
        System.out.print("Digite o código de origem do produto: ");
        int codigoOrigem = entrada.nextInt();
        double frete;
        String regiao;

        switch (codigoOrigem) {
            case 1:
                regiao = "Norte";
                frete = 0.1;
                break;
            case 2:
            case 5:
            case 9:
                regiao = "Sul";
                frete = 0.03;
                break;
            case 3:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                regiao = "Leste";
                frete = 0.012;
                break;
            case 7:
            case 20:
                regiao = "Oeste";
                frete = 0.073;
                break;
            default:
                regiao = "Importado";
                frete = 0.222;
                break;
        }

        double valorFinal = precoProduto + precoProduto * frete;

        System.out.printf("Preço do produto: R$ %.2f\n" + 
            "Região de precedência: %s\n" + 
            "Frete: R$ %.2f\n" + 
            "Valor final: R$ %.2f",
            precoProduto, regiao, precoProduto * frete, valorFinal
        );

        entrada.close();

    }
}
