public class Ex53 {
    public static void main(String[] args) {
        
        int a = 1, b = 1, c = 0;

        System.out.printf("%d, %d, ", a, b);

        for (int i = 0; c < 250; i++) {
            
            c = a + b;
            a = b;
            b = c;
            
            if (c < 250) {
                System.out.printf("%d, ", c);
            }
            
        }
    }
}
