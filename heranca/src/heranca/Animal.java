
package heranca;

public abstract class Animal {
	
	protected int membros;
	protected double peso;
	protected int idade;
	protected String porte;
	
	public int getMembros() {
		return this.membros;
	}
	
	public void setMembros(int membros) {
		this.membros =  membros;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getPorte() {
		return this.porte;
	}
	
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	protected abstract void comunicar();	
	
	protected abstract void movimentar();
}
