package aula4;

public class Main {
	public static void main(String[] args) {
		Livro livro = new Livro("O padrinho", "Don Corleone", 1972, 255, "Mafia");
		Revista revista = new Revista("Chato", "Paia", 2025, 100, "nao sei");
		System.out.println(livro.toString());
		System.out.println(revista.toString());
	}
}
