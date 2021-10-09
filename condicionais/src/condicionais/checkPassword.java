package condicionais;

import java.util.Scanner;

public class checkPassword {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		String senha = sc.nextLine();
		
		if(senha.equals("1234")) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO");
		}
		sc.close();		
	}
}
