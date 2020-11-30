import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos: ");
        int n = entrada.nextInt();

        int[] ah = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, n);
            ah[i] = entrada.nextInt();
            //ah[i] = (int) (Math.random() * 10);
            //System.out.printf("AH[%d/%d] = %d\n", i + 1, n, ah[i]);
        }

        System.out.print("Digite a quantidade de elementos: ");
        n = entrada.nextInt();

        int[] ai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um número[%d/%d]: ", i + 1, n);
            ai[i] = entrada.nextInt();
        }

        entrada.close();
        boolean estaContido = false;
        int posicao = 0;

        for (int i = 0; i <= ah.length - ai.length; i++) {
            estaContido = false;
            int contador = 0;

            for (int j = i; j < i + ai.length; j++) {
                if (ai[contador] == ah[j]) {
                    estaContido = true;
                } else {
                    estaContido = false;
                    break;
                }
                contador++;
            }

            if (estaContido) {
                posicao = i;
                break;
            }
        }

        if (estaContido) {
            System.out.println("Posição inicial no vetor AH = " + (posicao + 1));
        } else {
            System.out.println("Não está contido");
        }
    }
}
