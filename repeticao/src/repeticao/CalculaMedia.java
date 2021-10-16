package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double nota = 0;
		int qtdNotasValidas = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Digite sua nota: ");
			nota = input.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				qtdNotasValidas++;
				total += nota;
			} else if(nota != -1) {
				System.out.println("Nota inválida!");
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de notas digitadas: " + qtdNotasValidas);
		System.out.printf("Media: %.3f", total/qtdNotasValidas);
		
		input.close();

	}

}
