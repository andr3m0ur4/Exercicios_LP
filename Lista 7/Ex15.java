import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua frase: ");
        String frase = entrada.nextLine();
        boolean flag = false;
        entrada.close();

        for (int contador = 0; contador < frase.length(); contador++) {
            if (
                frase.toUpperCase().charAt(contador) >= (char) 48 &&
                frase.toUpperCase().charAt(contador) <= (char) 57
            ) {
                flag = true;
            }
        }
        
        if (flag) {
            System.out.println("Ha caracteres numericos.");
        } else {
            System.out.println("Nao ha caracteres numericos.");
        }
    }
}
