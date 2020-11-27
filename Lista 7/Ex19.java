import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a palavra: ");
        String palavra = entrada.next();
        String novaPalavra = "";
        entrada.close();
        
        for (int contador = palavra.length() - 1; contador >= 0; contador--) {
            novaPalavra += palavra.charAt(contador);
        }
        
        if (palavra.equals(novaPalavra)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }
    }
}
