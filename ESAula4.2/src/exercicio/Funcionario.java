package exercicio;

public class Funcionario extends Pessoa{
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, int idade, String cargo, double salario) {
		super(nome, idade);
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	protected String getCargo() {
		return nome;
	}
	
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	
	protected double getSalario() {
		return salario;
	}
	
	protected void setNome(String cargo) {
		this.cargo = cargo;
	}

}
