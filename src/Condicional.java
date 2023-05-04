public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento > 1999 && anoDeLancamento < 2010){
            System.out.println("Filme dos anos 00' que vale a pena assistir");
        } else if (anoDeLancamento >= 2010 && anoDeLancamento < 2020) {
            System.out.println("Filmes dos anos 10' que vale a pena assistir");
        } else {
            System.out.println("Filmes dos últimos 3 anos");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filmes para você");
        } else {
            System.out.println("Faça um upgrade de plano");
        }

        /*switch case: estrutura de controle de fluxo que permite executar diferentes ações com base no
        valor de uma expressão. É uma forma mais simplificada e legível de escrever vários blocos
        if/else encadeados. */
        int dia = 4;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);

    }
}
