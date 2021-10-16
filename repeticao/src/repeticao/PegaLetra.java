package repeticao;

import java.util.Scanner;

public class PegaLetra {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String word = input.next();
		
		for(int i=0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		input.close();
	}

}
