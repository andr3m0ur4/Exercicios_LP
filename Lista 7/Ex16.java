import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua frase: ");
        String frase = entrada.nextLine();
        boolean flag = true;
        entrada.close();

        for (int contador = 0; contador < frase.length(); contador++) {
            if (
                frase.charAt(contador) != ' ' &&
                (frase.charAt(contador) < (char) 65 || frase.charAt(contador) > (char) 90)
            ) {
                flag = false;
                break;
            }
        }
        
        if (flag) {
            System.out.println("Todos os caracteres sao maiusculos");
        }
    }
}
