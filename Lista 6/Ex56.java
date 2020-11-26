public class Ex56 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 900; i++) {
            int soma = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    soma += j;
                }
            }

            if (i == soma) {
                System.out.printf("%d, ", i);
            }
        }
    }
}
