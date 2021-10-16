package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class SomaNumPositivos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double soma = 0;
		double num = 0;
		
		do {
			soma += num;
			
			System.out.printf("A soma é %.2f", soma);
			System.out.println();
			
			
			System.out.print("Digite um número positivo: ");
			num = input.nextDouble();
			System.out.println();	
		} while(num > 0);
		
		
		input.close();
	}

}
