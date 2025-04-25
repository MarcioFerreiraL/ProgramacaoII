package atividade;

import java.util.ArrayList;

public class Aluno extends Pessoa{

	private int serie;
	private double media;
	private static ArrayList<Aluno> alunos = new ArrayList<>();

	
	public Aluno(String nome, String cpf, int idade, int serie, double media) {
	    super(nome, cpf, idade);
	    this.media = media;
	    this.serie = serie;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public static void listarAluno() {
		System.out.println("ALUNOS:");
	    for (Aluno aluno : alunos) {
	        System.out.println("NOME: " + aluno.getNome());
	        System.out.println("CPF: " +aluno.getCpf());
	        System.out.println("IDADE: " +aluno.getIdade());
	        System.out.println("MEDIA: " +aluno.getMedia());
	        System.out.println("SERIE: " +aluno.getSerie());
	        System.out.println(" ");
	    }
		System.out.println("\n-=-=-=-=-=-=-=-=-=--=-= \n");
	}


	public static void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	
}
