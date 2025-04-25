package atividade;

public class Main {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ze", "111.111.111-11", 19, 3, 3);
		Professor professor = new Professor("Messao", "222.222.222-22", 49, 2500, "Programa");
		Professor professor2 = new Professor("Jubileu", "222.222.222-22", 80, 25000, "Roda a bolsa");
		Funcionario funcionario1 = new Funcionario("Joe, o Magnata", "696.696.696-69", 69, 696969.6969, "O dia todo");
		
		Professor.adicionarProfessor(professor);
		Professor.adicionarProfessor(professor2);
		Professor.listarProfessor();
		
		Aluno.adicionarAluno(aluno1);
		Aluno.listarAluno();
		
		Funcionario.adicionarFuncionario(funcionario1);
		Funcionario.listarFuncionario();

	}
}
