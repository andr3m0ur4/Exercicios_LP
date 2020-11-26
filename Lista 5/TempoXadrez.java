import java.util.Scanner;

public class TempoXadrez {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo: ");
        int horaInicio = entrada.nextInt();
        System.out.print("Digite a hora final do jogo: ");
        int horaFim = entrada.nextInt();

        int duracaoJogo;

        if (horaFim < horaInicio) {
            duracaoJogo = horaFim + 24 - horaInicio;
        } else {
            duracaoJogo = horaFim - horaInicio;
        }

        System.out.println("Duração do jogo = " + duracaoJogo);

        entrada.close();

    }
}
