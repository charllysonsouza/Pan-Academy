package condicionais;

import java.util.Scanner;

public class TipoTriangulo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro lado do triângulo: ");
		int lado1 = input.nextInt();
		
		System.out.print("Digite o segundo lado do triângulo: ");
		int lado2 = input.nextInt();
		
		System.out.print("Digite o terceiro lado do triângulo: ");
		int lado3 = input.nextInt();
		
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.println("Triângulo equilátero");
		} else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			System.out.println("Triângulo escaleno");
		} else {
			System.out.println("Triângulo isósceles");
		}
		
		input.close();
	}

}
