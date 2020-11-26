import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite outro número: ");
        double num2 = entrada.nextDouble();
        System.out.print("Digite a operação aritmética: ");
        String op = entrada.next();

        switch (op.charAt(0)) {
            case '+':
                System.out.printf("%.1f + %.1f = %.1f", num1, num2, num1 + num2);
                break;
            case '-':
                System.out.printf("%.1f - %.1f = %.1f", num1, num2, num1 - num2);
                break;
            case '*':
                System.out.printf("%.1f x %.1f = %.1f", num1, num2, num1 * num2);
                break;
            case '/':
                System.out.printf("%.1f / %.1f = %.1f", num1, num2, num1 / num2);
                break;
            default:
                System.out.println("Operação inválida!");
        }

        entrada.close();

    }
}
