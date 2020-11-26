import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua frase: ");
        String frase = entrada.nextLine();
        int contador = 0;
        
        for (int i = 65; i < 65 + 26; i++) {

            for (int j = 0; j < frase.length(); j++) {
                if (frase.charAt(j) == (char) i) {
                    contador++;
                }
            }

        }

        System.out.printf("Existem %d caracteres maiusculos.", contador);

        entrada.close();
    }
}
