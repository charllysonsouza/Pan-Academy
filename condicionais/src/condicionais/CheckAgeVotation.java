package condicionais;

import java.util.Scanner;

public class CheckAgeVotation {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano de nascimento: ");
		int anoNascimento =  sc.nextInt();
		
		int idade = 2021 - anoNascimento;
		
		if(idade == 16 || idade == 17 || idade >= 70) {
			System.out.println("Seu voto é facultativo");
		} else if(idade > 17) {
			System.out.println("Seu voto é obrigatório");
		} else {
			System.out.println("Você não pode votar");
		}
		
		sc.close();
	}
}
