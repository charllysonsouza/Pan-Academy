package condicionais;

import java.util.Scanner;

public class Poligono {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número de lados: ");
		int lados = input.nextInt();
		
		String message = (lados < 3) ? "Não é Poligono" : (lados > 5 ) ? "Polígono não identificado" : "Poligono";
		
		System.out.println(message);
		
		input.close();
	}

}
