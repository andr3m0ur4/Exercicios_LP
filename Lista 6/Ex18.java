import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero total de mercadorias no estoque: ");
        int qtd = entrada.nextInt();
        double valor = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o valor da mercadoria: R$ ");
            valor += entrada.nextDouble();
        }

        double media = valor / qtd;

        System.out.println("Valor total em estoque = " + valor);
        System.out.println("Medias das mercadorias = R$ " + media);

        entrada.close();

    }
}
