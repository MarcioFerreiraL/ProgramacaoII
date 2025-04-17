package aula4;

public class Revista extends ItemBiblioteca{
	protected int edicao;
	protected String mesPublicacao;
	
	public Revista(String titulo, String autor, int anoPublicacao, int edicao, String mesPublicacao) {
		super(titulo, autor, anoPublicacao);
		this.edicao = edicao;
		this.mesPublicacao = mesPublicacao;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getMesPublicacao() {
		return mesPublicacao;
	}

	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}
	
	public String toString() {
		return String.format("REVISTA:\nTITULO: %s\nAUTOR: %s\nANO DE PUBLICAO: %d\nEDICAO: %dMÊS DE PUBLICACAO: %s\n", getTitulo(), getAutor(), getAnoPublicacao(), getEdicao(), getMesPublicacao());
	}
}
