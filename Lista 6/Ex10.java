import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int nota = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            nota += entrada.nextInt();
        }

        double media = nota / 10;

        System.out.println("Média = " + media);

        entrada.close();

    }
}
