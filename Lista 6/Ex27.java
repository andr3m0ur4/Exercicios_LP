public class Ex27 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d, ", i);
            for (int j = 1; j <= 11 - i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }

    }
}
