import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Deseja digitar a hora manualmente? S/N");
        String op = entrada.next();
        int hora;

        if (op.equalsIgnoreCase("S")) {
            System.out.print("Digite a hora: ");
            hora = entrada.nextInt();
        } else {
            hora = (int) (Math.random() * 24);
        }

        if (hora >= 0 && hora <= 6) {
            System.out.print("Zzzzzz");
        } else if (hora >= 7 && hora <= 11) {
            System.out.print("Bom dia");
        } else if (hora >= 12 && hora <= 17) {
            System.out.print("Boa tarde");
        } else if (hora >= 18 && hora <= 23) {
            System.out.print("Boa noite");
        }

        entrada.close();

    }
}
