import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua frase: ");
        String frase = entrada.nextLine();
        System.out.print("Digite o caractere: ");
        char caractere = entrada.next().charAt(0);
        entrada.close();

        frase = frase.replace(caractere, '*');
        
        System.out.printf(frase);
    }
}
