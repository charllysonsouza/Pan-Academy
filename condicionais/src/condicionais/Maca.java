package condicionais;

import java.util.Scanner;

public class Maca {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de maçãs: ");
		int qtd = input.nextInt();
		
		Double total = (qtd < 0 ) ? null : (qtd < 12) ? qtd * 0.30 : qtd * 0.25; 
		
		if (total != null) {
			System.out.println(String.format("O valor total da compra é de R$ %.2f%n", total));
		} else {
			System.out.println("Quantidade fornecida inválida");
		}
		
		
		input.close();
	}

}
