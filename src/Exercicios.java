import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro valor de entrada");
        int valor1 = leitura.nextInt();

        System.out.println("Digite o segundo valor de entrada");
        int valor2 = leitura.nextInt();

        int soma = valor1 + valor2;
        System.out.println("SOMA = " + soma);
        leitura.close();

        /*Scanner sc = new Scanner(System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();*/
    }
}
