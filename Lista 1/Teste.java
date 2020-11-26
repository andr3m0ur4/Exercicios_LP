import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        System.out.println("Olá Mundo terminal do computador!!");

        Scanner entrada = new Scanner(System.in);

        String valor = entrada.nextLine();

        System.out.println("Valor é " + valor);

        System.out.println(args[0]);

        entrada.close();

    }
}