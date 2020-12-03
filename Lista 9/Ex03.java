import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz: ");
        int n = entrada.nextInt();

        int [][] c =  new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = (int) (Math.random() * 100);
            }
        }

        entrada.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("[ %d ]\t", c[i][j]);
            }
            System.out.println();
        }
    }
}
