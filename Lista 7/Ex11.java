import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua frase: ");
        String frase = entrada.nextLine();
        
        for (int i = 65; i < 65 + 26; i++) {
            int contador = 0;

            for (int j = 0; j < frase.length(); j++) {
                if (frase.toUpperCase().charAt(j) == (char) i) {
                    contador++;
                }
            }

            System.out.printf("'%c' - %d vezes\n", (char) i, contador);
        }

        for (int i = 48; i < 48 + 10; i++) {
            int contador = 0;

            for (int j = 0; j < frase.length(); j++) {
                if (frase.toUpperCase().charAt(j) == (char) i) {
                    contador++;
                }
            }

            System.out.printf("%c - %d vezes\n", (char) i, contador);
        }

        entrada.close();
    }
}
