package exercicio;

import java.util.ArrayList;

public class Aluno {

	private String nome;
	private String cpf;
	private int idade;
	private static ArrayList<Aluno> alunos = new ArrayList<>(); 
	
	public Aluno(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		alunos.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public static ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public static void setAlunos(ArrayList<Aluno> alunos) {
		Aluno.alunos = alunos;
	}
	
	public void adicionarAlunos(String nome, String cpf, int idade) {
		new Aluno(nome, cpf, idade);
	}
	
	public void listarAlunos() {
		for (aluno : alunos) {
			System.out.println(aluno);
		}
	}
	
	
	
}
