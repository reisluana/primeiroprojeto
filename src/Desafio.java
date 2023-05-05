import java.util.Random;
import java.util.Scanner;

/*Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve
informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
 */

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int aleatorio = new Random().nextInt(100);
        int palpiteDoUsuario = 0;

        while (palpiteDoUsuario != aleatorio) {
            System.out.println("Você tem 5 tentativas para adivinhar o número gerado pela máquina. " +
                    "Digite um palpite entre 0 e 100");
            palpiteDoUsuario = leitura.nextInt();
            if (palpiteDoUsuario > 100 || palpiteDoUsuario < 0) {
                System.out.println("Escolha um número entre 0 e 100");
            } else if (palpiteDoUsuario < aleatorio) {
                System.out.println("O seu palpite é menor que o número gerado pela máquina");
            } else if (palpiteDoUsuario > aleatorio) {
                System.out.println("O seu palpite é maior que o número gerado pela máquina");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }
        }
    }
}
//esse código funciona, mas não consigo limitar a 5 tentativas

