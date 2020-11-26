import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da nota: ");
        double nota = entrada.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("VALOR INVALIDO");
        } else if (nota < 6) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("APROVADO");
        }

        entrada.close();
    }
}
