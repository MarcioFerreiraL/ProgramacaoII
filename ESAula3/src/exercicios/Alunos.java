package exercicios;

public class Alunos {
	private String nome;
	private String cpf;
	private int idade;
	private String serie;
	
	public void setValores(String nome, String cpf, int idade, String serie) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.serie = serie;
	}

	public void setNomeCpf(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public void printarValores(String aluno) {
		
	}
}
