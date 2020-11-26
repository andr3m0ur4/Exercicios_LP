import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double salario = 0;
        double soma = 0;
        int contador = 0;
        int somaFilhos = 0;
        double maior = 0;
        int pessoasMenorQue150 = 0;

        while (salario >= 0) {
            System.out.print("Digite o salario: R$ ");
            salario = entrada.nextDouble();

            if (salario < 0) {
                continue;
            }

            System.out.print("Digite o numero de filhos ");
            int filhos = entrada.nextInt();

            soma += salario;
            contador++;
            somaFilhos += filhos;

            if (salario > maior) {
                maior = salario;
            }

            if (salario < 150.0) {
                pessoasMenorQue150++;
            }
        }

        double mediaSalario = soma / contador;
        double mediaFilhos = somaFilhos / contador;
        double percentual = (pessoasMenorQue150 / (double) contador) * 100;

        System.out.println("Media de salario da populaçao: R$ " + mediaSalario);
        System.out.println("Media do numero de filhos: " + mediaFilhos);
        System.out.println("Maior salario dos habitantes: R$ " + maior);
        System.out.printf("Percentual de pessoas com salario menor que R$ 150,00 = %.0f%%\n", percentual);

        entrada.close();

    }
}
