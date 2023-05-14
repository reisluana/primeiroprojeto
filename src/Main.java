// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
    /*todo código em java precisa estar dentro de classes
    *  Os packages são um agrupamento lógico de classes relacionadas*/
    public static void main(String[] args){
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun - Maverick");

        //declarando variável: <tipo> <nome> = <valor inicial> (opcional)
        //exemplo: int idade = 25;
        //printf = formatação. no exemplo abaixo, quero formatar com DUAS casas decimais
        double b = 10.35784;
        System.out.printf("%.2f", b);
        //o printf também funciona na concatenação. exemplo:
        System.out.printf("O resultado é %.2f metros%n", b); //o %n no final indica quebra de linha
        //o println tem quebra de linha, o printf não

        //para alterar o idioma da minha aplicação, é necessário usar Locale
        //exemplo: Locale.setDefault(Locale.US) -> nesse caso, o programa vai imprimir números decimais com ponto (US),
        //e nao vírgula (BR). a declaração do Locale precisa ser feita ANTES do Scanner

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        /*tipos primitivos em java: boolean, byte, char, short, int, long, float, double
        o valor do char precisa ser colocado entre aspas simples

        é uma boa prática indicar o tipo do número.
        exemplo: para double, adicionar .0 (mesmo sendo inteiro); para float, adicionar o f.
        double h;
        h = 6.0;

        float c;
        c = 8f;

        * operadores de incremento: há dois tipos -> ++variavel and variavel++
         O operador de pré-incremento (++variavel) aumenta o valor da variável
         em 1 antes de usar a variável em uma expressão. Aqui está um exemplo:*/
        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6
        /*Já o operador de pós-incremento (variavel++) aumenta o valor da variável em 1 depois de
        usar a variável em uma expressão. Aqui está um exemplo:*/
        int num2 = 5;
        int resultado2 = num2++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(num2); // imprime 6
        System.out.println(resultado2); // imprime 5



        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        //o nome disso é Text Block:
        String comentario;
        comentario = """
                Filme Top!!!
                Muito bom
                Recomendo
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

        //o nome disso é CASTING: converter tipos de dados
        //peguei um valor double (media) e converti para inteiro
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
        /*Essa conversão pode ser feita de forma automática pelo compilador (conversão implícita),
        quando o tipo de dado de destino é compatível com o tipo de dado de origem, ou de forma manual
        (conversão explícita), utilizando o operador de casting.

         CASTING IMPLÍCITO:*/
        int x = 10;
        double y = x; // casting implícito
        //CASTING EXPLÍCITO:
        double xou = 10.5;
        int yas = (int) xou; // casting explícito
        /*O casting explícito é realizado quando o tipo de dado de origem é incompatível com o tipo de
        dado de destino. Nesse caso, devemos utilizar o operador de casting para realizar a conversão
         */
        int temperaturaCelsius = 34;
        double conversorFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println(conversorFahrenheit);
        int temperaturaFahrenheit = (int) conversorFahrenheit;
        //System.out.println("A temperatura em Fahrenheit é " + temperaturaFahrenheit);
        System.out.println(String.format("A temperatura em Celsius é %d e em Fahrenheit é %d ",
                temperaturaCelsius, temperaturaFahrenheit));


        //comparando strings: método equals()
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        //essa é a template string do java: há dois formatos, o .format e o .formatted (que pode ser usado em text block)
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
        /* o %.2f indica que quero apenas duas casas decimais. nesse caso o número é arredondado para 56 */

        String nomeCompleto = "João Veiga";
        int aulas = 4;
        //a segunda maneira é essa:
        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nomeCompleto, aulas);
        System.out.println(mensagem);


    }
}