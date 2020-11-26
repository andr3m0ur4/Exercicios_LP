public class Ex16 {
    public static void main(String[] args) {
        
        int soma = 0;
        int contador = 0;

        for (int i = 15; i <= 100; i++) {
            soma += i;
            contador++;
        }

        double media = soma / contador;

        System.out.println(contador);
        System.out.println("Média = " + media);

    }
}
