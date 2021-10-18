package heranca;

public class Mamifero extends Animal{
	
	private String corPelo;
	
	public String getCorPelo() {
		return this.corPelo;
	}
	
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	@Override
	protected void comunicar() {
		System.out.println("Som de mamífero");
	}
	
	@Override
	protected void movimentar() {
		System.out.println("Mamífero se movimentando");
	}
}
