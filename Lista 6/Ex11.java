import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de alunos existentes: ");
        int alunos = entrada.nextInt();
        double notas = 0;

        for (int i = 0; i < alunos; i++) {
            System.out.print("Digite a nota: ");
            notas += entrada.nextDouble();
        }

        double media = notas / alunos;

        System.out.println("Média das notas = " + media);

        entrada.close();

    }
}
