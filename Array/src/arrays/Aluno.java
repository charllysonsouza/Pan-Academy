package arrays;

public class Aluno {
	
	private String nome;
	double[] notas;
	
	public Aluno(String nome, double[] notas) {
		this.nome = nome;
		this.notas = notas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public boolean aprovado() {
		boolean result = false;
		if(this.media() > 7) {
			result = true;
		}
		return result;
	}
	
	public double maiorNota() {
		double maior = 0;
		for(double x : getNotas()) {
			if(x > maior) {
				maior = x;
			}
		}
		return maior;
	}
	
	public double media() {
		double soma = 0;
		for(double x : getNotas()) {
			soma += x;
		}
		return soma/notas.length;
	}	
}
