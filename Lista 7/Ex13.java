import java.util.Scanner;

class Ex13 {
    public static void main(String [] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua frase: ");
        String frase = entrada.nextLine();
        int consoantes = 0;
        entrada.close();

        for (int contador = 0; contador < frase.length(); contador++) {
            if (
                frase.toUpperCase().charAt(contador) != 'A' &&
                frase.toUpperCase().charAt(contador) != 'E' &&
                frase.toUpperCase().charAt(contador) != 'I' &&
                frase.toUpperCase().charAt(contador) != 'O' &&
                frase.toUpperCase().charAt(contador) != 'U' &&
                frase.toUpperCase().charAt(contador) >= (char) 65 &&
                frase.toUpperCase().charAt(contador) <= (char) 90
            ) {
                consoantes++;
            }
        }
        
        System.out.printf("Numero de consoantes: %d\n", consoantes);
    }
}