package arrays;

public class ExercicioArray1 {

	public static void main(String[] args) {
		
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

		int soma = 0;
		int maior = 0;
		int menor = 1000000000;

		for (int x : array) {
			soma += x;
			
			if(x > maior) {
				maior = x;
			}
			
			if(x < menor) {
				menor = x;
			}
		}
		
		System.out.println("Soma de todos elementos = " + soma);
		System.out.printf("Média de todos os elementos = %.2f%n", (double) soma/array.length);
		System.out.printf("Maior elemento = %d%nMenor elemento = %d%n", maior, menor);
	}
}
