import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a cadeia de caracteres: ");
        String caracteres = entrada.next();
        boolean flag = false;
        entrada.close();

        if (caracteres.length() != 8) {
            flag = true;
        } else {
            for (int i = 0; i < caracteres.length(); i++) {
                if (caracteres.charAt(i) != '0' && caracteres.charAt(i) != '1') {
                    flag = true;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("A cadeia inserida não é binária de 8 bits!");
        } else {
            System.out.println("A cadeia inserida é binária de 8 bits!");
        }
    }
}
