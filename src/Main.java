// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main{
    public static void main(String[] args){
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun - Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean inlcluidoNoPlano = true;
        double notaDoFilme = 8.1;

        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        String comentario;
        comentario = """
                Filme Top!!!
                Muito bom
                Recomendo
                Bom demais!
                """;
        System.out.println(comentario);

        double avaliador1 = 9.8;
        double avaliador2 = 8.8;
        double avaliador3 = 8.5;

        double media = (avaliador1 + avaliador2 + avaliador3) / 3;
        System.out.println("A nota média do filme segundo a crítica especializada é " + media);

        if (media >= 7){
            System.out.println("O filme está classificado");
        } else {
            System.out.println("O filme está desclassificado");
        }
    }
}