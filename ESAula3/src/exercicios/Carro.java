package exercicios;

public class Carro {
	public String marcaModelo;
	public int ano;
	public float valor;
	
	public Carro() {
		this.marcaModelo = "Fiat Uno";
		this.ano = 2005;
		this.valor = 20000f;
	}
	public Carro(String marcaModelo, int ano, float valor) {
		this.marcaModelo = marcaModelo;
		this.ano = ano;
		this.valor = valor;
	}
	public String getMarcaModelo() {
		return marcaModelo;
	}
	public void setMarcaModelo(String marcaModelo) {
		this.marcaModelo = marcaModelo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void buzina() {
		System.out.println("biiiiiiiiiiiiiiiii");
	}
	public void buzina(boolean volume ) {
		if(volume == true) {
			System.out.println("BIIIIIIIIIIIIIIIIIIIIIIIII");
		}
	}
}
