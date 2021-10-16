package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class VerificaMaior {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double maior = 0;
		
		int i = 0;
		while(i < 10) {
			System.out.print("Entre com um número: ");
			double n = input.nextDouble();
			
			if(n > maior) {
				maior = n;
			}
			
			i++;
		}
		
		System.out.println();
		System.out.println("Maior número = " + maior);
		
		input.close();
	}

}
