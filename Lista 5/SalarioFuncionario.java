import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero de horas trabalhadas no mes: ");
        int horasTrabalhadas = entrada.nextInt();
        System.out.print("Digite o salario por hora: ");
        double salarioHora = entrada.nextDouble();
        double horaExtra = 0;

        if (horasTrabalhadas > 160) {
            horaExtra = (horasTrabalhadas - 160) * (salarioHora * 0.5);
        }

        double salarioTotal = horasTrabalhadas * salarioHora + horaExtra;

        System.out.println("Salario total do funcionario: R$ " + salarioTotal);

        entrada.close();

    }
}
