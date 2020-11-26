public class Ex28 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d, ", i);
            for (int j = i + 1; j <= 10; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}
