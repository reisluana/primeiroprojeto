public class StringsEx {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG ";
        String s01 = original.toLowerCase(); //todas as letras para lower case
        String s02 = original.toUpperCase(); //todas as letras para caixa alta
        String s03 = original.trim(); //corta os espaços do início e do final
        String s04 = original.substring(2); //cria uma nova string a partir do índice indicado no argumento
        String s05 = original.substring(2, 9); //mesmo que o de cima, mas nesse caso indicamos o índice inicial e o final
        String s06 = original.replace('a', 'x'); //substitui todos os elementos 'a' por 'x'
        String s07 = original.replace("abc", "xy"); //mesmo que o de cima (há diferenciação de upper e lower case)
        int i = original.indexOf("bc"); //mostra o índice da primeira ocorrência do elemento indicado, nesse caso 'bc'
        int j = original.lastIndexOf("bc"); //mostra o índice da última ocorrência do elemento indicado

        String s = "potato apple lemon";
        String[] vect = s.split(" "); //string[] é um vetor
        //a função do split é pegar cada um dos elementos separado por um espaço " " e armazenar em uma variável

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
    }
}
