public class Ex47 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            boolean validacao = false;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    validacao = true;
                    break;
                }
            }

            if (!validacao && i != 1 && i != 0 && i != -1) {
                System.out.printf("%d, ", i);
            }
        }
    }
}
