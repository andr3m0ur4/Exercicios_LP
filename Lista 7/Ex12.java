import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua frase: ");
        String frase = entrada.nextLine();
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int contador = 0; contador < frase.length(); contador++) {
            if (frase.toUpperCase().charAt(contador) == (char) 'A') {
                a++;
            }
            if (frase.toUpperCase().charAt(contador) == (char) 'E') {
                e++;
            }
            if (frase.toUpperCase().charAt(contador) == (char) 'I') {
                i++;
            }
            if (frase.toUpperCase().charAt(contador) == (char) 'O') {
                o++;
            }
            if (frase.toUpperCase().charAt(contador) == (char) 'U') {
                u++;
            }
        }
        
        System.out.printf("A - %d vezes\n", a);
        System.out.printf("E - %d vezes\n", e);
        System.out.printf("I - %d vezes\n", i);
        System.out.printf("O - %d vezes\n", o);
        System.out.printf("U - %d vezes\n", u);

        entrada.close();
    }
}
