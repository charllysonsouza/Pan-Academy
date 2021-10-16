package repeticao;

public class ContagemIntervalos {

	public static void main(String[] args) {
		
		int  i = 233;
		while(i<=456) {
			System.out.println(i);
			if(i >= 300 && i <= 400) {
				i += 3;
			} else {
				i += 5;
			}		
		}
	}
}