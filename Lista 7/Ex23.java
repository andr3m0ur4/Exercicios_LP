import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome completo: ");
        String nomeCompleto = entrada.nextLine();
        String [] nomes = nomeCompleto.split(" ");
        entrada.close();

        System.out.println(nomes[nomes.length - 1]);
    }
}
