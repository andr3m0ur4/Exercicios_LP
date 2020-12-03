import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int [][] a = new int[4][5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                //System.out.printf("Digite o elemento da matriz[%d/%d]: ", i + 1, j + 1);
                //a[i][j] = entrada.nextInt();
                a[i][j] = (int) (Math.random() * 20);
            }
        }

        entrada.close();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("[ %d ]", a[i][j]);
            }
            System.out.println();
        }
    }
}
