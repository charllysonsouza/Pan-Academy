package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if(media>=0 && media<=10) {
			if(media >= 7 && media < 10) {
				System.out.println("Aluno foi aprovado!");
			} else if(media < 7) {
				System.out.println("Aluno foi reprovado");
			} else {
				System.out.println("Aluno foi reprovado com distinção");
			}
		} else {
			System.out.println("Entrada inválida");
		}
		sc.close();
	}
}
