import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual é o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        // nextLine para string ; nextInt para inteiro ; nextDouble para decimais

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

        /*A classe Scanner do Java é utilizada para ler dados de entrada em um programa Java. Esses dados podem
        ser lidos a partir de várias fontes de entrada, como arquivos, fluxos de entrada, Strings e até mesmo a
        entrada do usuário através do teclado, como visto no exemplo*/
    }
}
