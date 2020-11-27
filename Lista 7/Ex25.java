import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        boolean tamanho, letras, numeros, simbolos;
        
        do {
            System.out.print("Digite a senha: ");
            String senha = entrada.nextLine();
            
            tamanho = true;
            letras = false;
            numeros = false;
            simbolos = false;
            int numLetras = 0, numNumeros = 0, numSimbolos = 0;

            if (senha.length() < 10) {
                tamanho = false;
            }

            for (int i = 0; i < senha.length(); i++) {
                if (
                    (senha.charAt(i) >= 65 && senha.charAt(i) <= 90) ||
                    (senha.charAt(i) >= 97 && senha.charAt(i) <= 122)
                ) {
                    numLetras++;
                } else if (senha.charAt(i) >= 48 && senha.charAt(i) <= 57) {
                    numNumeros++;
                } else {
                    numSimbolos++;
                }
            }

            if (numLetras >= 3) letras = true;
            if (numNumeros >= 3) numeros = true;
            if (numSimbolos >= 3) simbolos = true;

            System.out.printf("Regras\nTamanho 10: %d (%s)\n", senha.length(), tamanho ? "ok" : "x");
            System.out.printf("Letras 3: %d (%s)\n", numLetras, letras ? "ok" : "x");
            System.out.printf("Números 3: %d (%s)\n", numNumeros, numeros ? "ok" : "x");
            System.out.printf("Símbolos 3: %d (%s)\n", numSimbolos, simbolos ? "ok" : "x");

            if (!tamanho || !letras || !numeros || !simbolos) {
                System.out.println("Senha reprovada! Tente novamente.");
            }
        } while (!tamanho || !letras || !numeros || !simbolos);

        System.out.println("Senha aprovada! Parabéns!");

        entrada.close();
    }
}
