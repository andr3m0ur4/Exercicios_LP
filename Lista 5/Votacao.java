import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = entrada.nextInt();
        System.out.print("Digite o ano de nascimento da pessoa: ");
        int anoNascimento = entrada.nextInt();

        if ((anoAtual - anoNascimento) < 16) {
            System.out.println("Nãso poderá votar este ano.");
        } else {
            System.out.println("Poderá votar este ano.");
        }

        entrada.close();

    }
}
