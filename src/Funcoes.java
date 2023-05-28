import java.util.Scanner;
//Fazer um programa para ler três números inteiros e mostrar na tela o maior deles
public class Funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);

        sc.close();

    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
    /*quando a função não retorna um valor que vai ser reaproveitado e está apenas imprimindo algo na tela/fazendo uma ação,
     dizemos que ela retorna um tipo vazio (void)*/
    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}
