import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        char op = 'S';
        double valor = 0;
        int qtd = 0;

        while (op == 'S') {
            System.out.print("Digite o valor da mercadoria: R$ ");
            valor += entrada.nextDouble();
            qtd++;
            System.out.print("MAIS MERCADORIAS (S/N)? ");
            op = entrada.next().toUpperCase().charAt(0);
        }

        double media = valor / qtd;

        System.out.println("Valor total em estoque = " + valor);
        System.out.println("Medias das mercadorias = R$ " + media);

        entrada.close();

    }
}
