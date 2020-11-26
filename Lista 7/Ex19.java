import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a palavra: ");
        String palavra = entrada.next();
        String novaPalavra = "";
        entrada.close();
        
        for (int contador = 0; contador < palavra.length(); contador++) {
            if (frase1.charAt(contador) != frase2.charAt(contador)) {
                flag = true;
                break;
            }
        }
        
        
        if (!flag) {
            System.out.println("As frases sao iguais");
        } else {
            System.out.println("As frases nao sao iguais");
        }
    }
}
