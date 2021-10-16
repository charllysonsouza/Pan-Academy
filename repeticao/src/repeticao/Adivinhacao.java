package repeticao;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random gerador = new Random();

		int i = 10;

		int num = gerador.nextInt(101);

		while (i > 0) {

			System.out.print("Tente adivinhar um número entre 0 e 100: ");
			int n = input.nextInt();
			System.out.println();
			
			if (i > 0) {
				if (n < num) {
					System.out.println("O número digitado é menor");
				} else if (n > num) {
					System.out.println("O número digitado é maior");
				} else {
					System.out.println("Parabéns, você acertou!");
					break;
				}
				i--;
				System.out.println("Você ainda possui " + i + " tentativas");
				System.out.println();
			} else {
				System.out.println("Você já utilizou todas as suas tentativas");
			}
		}
		input.close();
	}

}
