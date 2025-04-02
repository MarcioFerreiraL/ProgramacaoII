package exercicio;

public class Cachorro extends Animal{
	private String raca;
	
	public Cachorro(String nome, String raca) {
		super(nome);
		this.raca = raca;
	}
	
	public void setCachorro(String nome, String raca) {
		this.raca = raca;
		this.nome = nome;
	}
	
	public String getCachorroNome() {
		return nome;
	}
	
	public String getCachorroRaca() {
		return raca;
	}
	
	@Override
	public String toString() {
		return String.format("OS DADOS DO CACHORRO É %s: ", getCachorroNome());
	}
}
