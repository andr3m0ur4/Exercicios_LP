import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a frase: ");
        String frase = entrada.nextLine();
        System.out.print("Digite a palavra: ");
        String palavra = entrada.next();
        int contador = 0;
        entrada.close();
        
        
        for (int i = 0; i <= frase.length() - palavra.length(); i++) {
            String auxiliar = frase.substring(i, i + palavra.length());

            if (auxiliar.equals(palavra)) {
                contador++;
            }
        }
        
        System.out.printf("Ocorre %d vezes\n", contador);
    }
}
