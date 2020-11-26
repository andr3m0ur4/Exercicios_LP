import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua frase: ");
        String frase = entrada.nextLine();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.toLowerCase().charAt(i) == ' ') {
                contador++;
            }
        }

        System.out.printf("Existem %d espaços.", contador);

        entrada.close();
    }
}
