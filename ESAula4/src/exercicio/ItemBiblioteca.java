package exercicio;

public class ItemBiblioteca {

	protected String titulo;
	protected String autor;
	protected int anoPublicacao;
	
	protected ItemBiblioteca(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	protected String exibirInformacoes() {
		return String.format("TITULO: %s\n AUTOR: %s\n ANO DE PUBLICAO: %d\n", titulo, autor, anoPublicacao);
	}
	
}
