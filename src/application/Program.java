package application;

import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron)*/

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x, y; /*estamos importando do pacote entities. Dessa forma o triangulo vira uma única variavel do tipo
        triangulo. Para que o objeto exista, precisamos instanciar:*/
        x = new Triangulo();
        y = new Triangulo();// os triângulos x & y são objetos. objetos são instâncias da classe

        //classe é a definição do tipo. objetos são instâncias da classe

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble(); //aqui estamos acessando os atributos do triangulo x
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble(); //aqui estamos acessando os atributos do triangulo y
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        sc.close();
}
