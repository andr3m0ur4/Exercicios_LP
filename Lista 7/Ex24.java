import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a sequência de dígitos: ");
        String digitos = entrada.nextLine();
        entrada.close();
        int maior = 0, contador = 0;

        for (int i = 0; i < digitos.length(); i++) {
            if (digitos.charAt(i) == '1') {
                contador++;
            } else {
                contador = 0;
            }

            if (contador > maior) {
                maior = contador;
            }
        }

        System.out.println("Tamanho da maior sequência de números consecutivos de 1 = " + maior);
    }
}
