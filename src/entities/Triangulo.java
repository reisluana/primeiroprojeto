package entities;
//estamos considerando que o triângulo é uma entidade do nosso negócio
public class Triangulo {
    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
/*para criar uma função: colocamos o public para que a função possa ser utilizada em outros arquivos.
o tipo do retorno, nesse caso, é double (indica o tipo de valor que essa função irá retornar)
* em seguida vem o nome da operação -> area() nesse caso, não recebe parâmetros. os parâmetros são o que a função
 precisa receber para fazer o que ela tem que fazer. no caso dessa função específica, os dados já presentes na classe
 (a, b e c) já são suficientes para calcular a área do triângulo*/