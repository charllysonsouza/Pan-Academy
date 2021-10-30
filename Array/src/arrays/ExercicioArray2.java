package arrays;

import java.util.ArrayList;				
import java.util.List;

public class ExercicioArray2 {

	public static void main(String[] args) {
		
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares2x = new ArrayList<>();
		
		int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125};
		
		for(int x : array2) {
			if(x % 2 == 0) {
				pares.add(x);
			} else {
				impares2x.add(x * 2);
			}
		}
		
		System.out.println("Pares do Array");
		for(int x : pares) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Ímpares multiplicados por 2");
		for(int x : impares2x) {
			System.out.println(x);
		}
	}
}
