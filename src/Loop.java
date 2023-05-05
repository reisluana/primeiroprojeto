import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;


        for (int i = 0; i < 3; i++) {  /* o i é o incremento, o 0 é o ponto inicial do laço, o 3 é até onde o laço
         vai. são 3 notas, então vai de 0 à 3. */
            System.out.println("Diga sua avaliação para o filme");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota; //mediaAvaliacao igual à mediaAvaliacao + nota
        }

        int estrelas = (int) mediaAvaliacao/3;
        System.out.println("A média de avaliações é " + mediaAvaliacao/3 + ". Esse filme tem " + estrelas + " estrelas.");

    }
}
