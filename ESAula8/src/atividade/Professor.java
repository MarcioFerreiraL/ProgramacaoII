package atividade;

import java.util.ArrayList;

public class Professor extends Funcionario{
	
	private String disciplina;
	private static ArrayList<Professor> professores = new ArrayList<>();


	protected Professor(String nome, String cpf, int idade, double salario, String disciplina) {
	    super(nome, cpf, idade, salario, null);
	    this.disciplina = disciplina;
	}


	public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	public static void listarProfessor() {
		System.out.println("PROFESSORES:");
	    for (Professor professor : professores) {
	        System.out.println("NOME: " + professor.getNome());
	        System.out.println("CPF: " +professor.getCpf());
	        System.out.println("IDADE: " +professor.getIdade());
	        System.out.println("SALARIO: " +professor.getSalario());
	        System.out.println("DISCIPLINA: " +professor.getDisciplina());
	        System.out.println(" ");
	    }
		System.out.println("\n-=-=-=-=-=-=-=-=-=--=-= \n");
	}


	public static void adicionarProfessor(Professor professor) {
		professores.add(professor);
	}

}
