import java.util.Scanner;

public class Vendedor {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = entrada.nextDouble();
        System.out.print("Digite o valor das vendas efetuadas: ");
        double valorVendas = entrada.nextDouble();

        double salarioTotal;

        if (valorVendas <= 1500) {
            salarioTotal = salarioFixo + (valorVendas * 0.03);
        } else {
            salarioTotal = salarioFixo + (valorVendas * 0.03) + ((salarioFixo - 1500) * 0.05);
        }

        System.out.println("Salário total = R$ " + salarioTotal);

        entrada.close();

    }
}
