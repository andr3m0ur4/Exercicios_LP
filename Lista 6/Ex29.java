public class Ex29 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d, ", i);
            for (int j = 1; j <= 10; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.printf("%d ", j);
                    }
                } else {
                    if (j % 2 == 1) {
                        System.out.printf("%d ", j);
                    }
                }
            }
            System.out.println();
        }

    }
}
