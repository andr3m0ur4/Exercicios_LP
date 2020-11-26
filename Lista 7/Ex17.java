import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a primeira frase: ");
        String frase1 = entrada.nextLine();
        System.out.print("Digite a segunda frase: ");
        String frase2 = entrada.nextLine();
        boolean flag = false;
        entrada.close();

        if (frase1.length() == frase2.length()) {
            for (int contador = 0; contador < frase1.length(); contador++) {
                if (frase1.charAt(contador) != frase2.charAt(contador)) {
                    flag = true;
                    break;
                }
            }
        } else {
            flag = true;
        }
        
        if (!flag) {
            System.out.println("As frases sao iguais");
        } else {
            System.out.println("As frases nao sao iguais");
        }
    }
}
