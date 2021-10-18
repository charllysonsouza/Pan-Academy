package heranca;

public class Ave extends Animal {
	
	protected String corPena; 
	
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	protected void comunicar() {
		System.out.println("Som de ave");
	}
	
	@Override
	protected void movimentar() {
		System.out.println("Voando");
	}
}
