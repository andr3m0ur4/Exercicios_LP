import java.util.Arrays;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos: ");
        int n = entrada.nextInt();

        int[] aj = new int[n];
        int numero;

        for (int i = 0; i < n; i++) {
            numero = (int) (Math.random() * 100);

            for (int j = 0; j < n; j++) {
                if (numero == aj[j] && j != i) {
                    numero = (int) (Math.random() * 100);
                } else {
                    aj[i] = numero;
                }
            }
        }

        Arrays.sort(aj);
        boolean existe = false;
        int posicao = 0;

        for (int i = 0; i < n; i++) {
            //System.out.printf("%d - ", aj[i]);
        }

        for (int contador = 0; contador < 10; contador++) {
            System.out.print("Digite um valor: ");
            numero = entrada.nextInt();
            
            for (int i = 0; i < n; i++) {
                if (numero == aj[i]) {
                    existe = true;
                    posicao = i;
                    break;
                }
            }

            if (existe) break;
            System.out.println("Você errou!");
        }

        entrada.close();
        
        if (existe) {
            System.out.printf("Você acertou!\nPosição no vetor AJ = " + posicao);
        } else {
            System.out.println("Que pena, Não foi dessa vez!");
        }        
    }
}
