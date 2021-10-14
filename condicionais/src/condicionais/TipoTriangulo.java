package condicionais;

import java.util.Scanner;

public class TipoTriangulo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro ângulo: ");
		double a1 = input.nextDouble();

		System.out.print("Digite o segundo ângulo: ");
		double a2 = input.nextDouble();
		
		System.out.print("Digite o terceiro ângulo: ");
		double a3 = input.nextDouble();
		
		if(a1 + a2 + a3 > 180) {
			System.out.println("Os angulos informados não são de um triângulo");
		} else if(a1 == 90 || a2 == 90 || a3 == 90) {
			System.out.println("Triângulo Retângulo");
		} else if(a1 > 90 || a2 > 90 || a3 >90) {
			System.out.println("Triângulo obtusângulo");
		} else if (a1 < 90 && a2 < 90 & a3 < 90) {
			System.out.println("Triângulo acutângulo");
		}
		
		input.close();
	}

}
