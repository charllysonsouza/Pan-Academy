package arrays;

public class Program {

	public static void main(String[] args) {
		
		double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
		
		Aluno a1 = new Aluno("Charllyson", notas);
		
		System.out.println("Maior nota: " + a1.maiorNota());
		System.out.println("Média: " + a1.media());
		System.out.println(a1.aprovado() ? "Aprovado" : "Reprovado");
	}

}
