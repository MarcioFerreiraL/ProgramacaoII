package atividade;

import java.util.ArrayList;

public class Funcionario extends Pessoa{

	private double salario;
	private String turno;
	private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
	
	protected Funcionario(String nome, String cpf, int idade, double salario, String turno) {
		super(nome, cpf, idade);
		this.salario = salario;
		this.turno = turno;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public static void listarFuncionario() {
		System.out.println("FUNCIONARIOS:");
	    for (Funcionario funcionario : funcionarios) {
	        System.out.println("NOME: " + funcionario.getNome());
	        System.out.println("CPF: " +funcionario.getCpf());
	        System.out.println("IDADE: " +funcionario.getIdade());
	        System.out.println("SALARIO: " +funcionario.getSalario());
	        System.out.println("TURNO: " +funcionario.getTurno());
	        System.out.println(" ");
	    }
		System.out.println("\n-=-=-=-=-=-=-=-=-=--=-= \n");
	}


	public static void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
}
