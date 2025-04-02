package exercicio;

public class Animal {
	protected String nome;
	
	protected Animal(String nome) {
		this.nome = nome;
	}
	
	protected void setNome(String nome) {
		this.nome = nome;
	}
	
	protected String getNome() {
		return nome;
	}
	
	public void som() {
		System.out.println("Barulho do despertador");
	}
}
