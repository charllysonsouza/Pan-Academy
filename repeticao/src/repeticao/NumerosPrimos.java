package repeticao;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		int qtdDivisores = 0;
		
		System.out.print("Digite um número inteiro positivo: ");
		int num = input.nextInt();
		
		for(int i=2; i <= num/2; i++) {
			if(num % i == 0) {
				qtdDivisores++;
				break;
			}
		}
		
		System.out.println((qtdDivisores == 0) ? "Número primo" : "Número não é primo");
		
		input.close();
	}

}
