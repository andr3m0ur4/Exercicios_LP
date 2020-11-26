import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um caracter: ");
        char caracter = entrada.nextLine().charAt(0);
        System.out.print("Digite sua frase: ");
        String frase = entrada.nextLine();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.toLowerCase().charAt(i) == Character.toLowerCase(caracter)) {
                contador++;
            }
        }

        System.out.printf("Caracter '%c' aparece: %d vezes", caracter, contador);

        entrada.close();
    }
}
