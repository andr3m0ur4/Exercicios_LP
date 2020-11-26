import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        char op;

        do {
            double nota1, nota2;

            do {
                System.out.print("Digite a nota da 1 avaliacao: ");
                nota1 = entrada.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.print("Digite a nota da 2 avaliacao: ");
                nota2 = entrada.nextDouble();
            } while (nota2 < 0 && nota2 > 10);

            double media = (nota1 + nota2) / 2;
            System.out.println("Media simples = " + media);
            System.out.print("NOVO CALCULO (S/N)? ");
            op = entrada.next().toUpperCase().charAt(0);
        } while (op == 'S');

        entrada.close();

    }
}
