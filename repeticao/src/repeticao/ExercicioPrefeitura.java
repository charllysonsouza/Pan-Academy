package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPrefeitura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double totSalario = 0;
		double maior = 0;
		double totFilhos = 0;
		double qtd = 0;

		for (int i = 0; i < 20; i++) {
			System.out.print("Digite o salário do habitante " + (i + 1) + ": ");
			double salario = input.nextDouble();

			System.out.print("Digite a quantidade de filhos do habitante " + (i + 1) + ": ");
			int filhos = input.nextInt();

			totSalario += salario;
			totFilhos += filhos;

			if (salario > maior) {
				maior = salario;
			}

			if (salario <= 100) {
				qtd++;
			}
		}

		System.out.println();
		System.out.printf("Média do salário da população é R$ %.2f%n", totSalario / 20);
		System.out.printf("Média do número de filhos é %.2f%n", totFilhos / 20);
		System.out.printf("Maior salário = R$ %.2f%n", maior);
		System.out.println("Percentual de pessoas com salário até R$ 100,00 = " + (qtd / 20 * 100) + "%");

		input.close();
	}

}
