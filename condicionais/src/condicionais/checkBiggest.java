package condicionais;

import java.util.Scanner;

public class checkBiggest {

	public static void main(String[] args) {
		int maior;
		int menor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");		
		int n1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");		
		int n2 = sc.nextInt();
		
		System.out.print("Digite o terceiro número: ");		
		int n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			maior = n1;
		} else if (n2 > n3) {
			maior = n2;
		} else {
			maior = n3;
		}
		
		if(n1 < n2 && n1 < n3) {
			menor = n1;
		} else if(n2 < n3) {
			menor = n2;
		} else {
			menor = n3;
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
		sc.close();
	}
}
