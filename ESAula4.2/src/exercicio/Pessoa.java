package exercicio;

public class Pessoa {
	protected String nome;
	protected int idade;
	
	protected Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	protected String getNome() {
		return nome;
	}
	
	protected void setIdade(int idade) {
		this.idade = idade;
	}
	
	protected int getIdade() {
		return idade;
	}
	
	protected void setNome(String nome) {
		this.nome = nome;
	}
}