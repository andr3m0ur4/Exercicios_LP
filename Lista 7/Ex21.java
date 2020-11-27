import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a frase: ");
        String frase = entrada.nextLine();
        String [] palavras = frase.split(" ");
        entrada.close();

        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }
    }
}
