package aula4;

public class Livro extends ItemBiblioteca{
	private int numeroPaginas;
	private String genero;
	
	public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas, String genero) {
		super(titulo, autor, anoPublicacao);
		this.numeroPaginas = numeroPaginas;
		this.genero = genero;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String toString() {
		return String.format("LIVRO:\nTITULO: %s\nAUTOR: %s\nANO DE PUBLICAO: %d\nNUMERO DE PAGINAS: %dGENERO: %s\n", getTitulo(), getAutor(), getAnoPublicacao(), getNumeroPaginas(), getGenero());
	}
}
