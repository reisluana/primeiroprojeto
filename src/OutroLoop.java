import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        //o for é mais utilizado quando há um número fixo e sabemos quantas vezes a operação irá se repetir
        //enquanto que o while é utilizado quando o número de repetições é desconhecido

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota; //mediaAvaliacao igual à mediaAvaliacao + nota
            totalDeNotas++;

            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        int estrelas = (int) mediaAvaliacao/3;
        System.out.println("A média de avaliações é " + mediaAvaliacao/totalDeNotas + ". Esse filme tem "
                + estrelas + " estrelas.");
    }
}
