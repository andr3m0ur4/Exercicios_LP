public class Ex02 {
    public static void main(String[] args) {

        int n = 6, m = 3;
        int [][] b = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[ %d ]\t", b[i][j]);
            }
            System.out.println();
        }

        System.out.println("----------------------------");

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                System.out.printf("[ %d ]\t", b[i][j]);
            }
            System.out.println();
        }
    }
}
