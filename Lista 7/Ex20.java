import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a frase: ");
        String frase = entrada.nextLine();
        int numPalavras = frase.split(" ").length;
        entrada.close();
        
        System.out.println("Número de palavras da frase = " + numPalavras);
    }
}
