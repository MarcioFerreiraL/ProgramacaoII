package exercicio;

public class Veiculo {
	protected static final boolean True = false;
	protected String marca;
	protected String modelo;
	protected int ano;
	
	protected Veiculo(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	protected String acelerar() {
		return ("vrum vrum vrum");
	}
	
	protected boolean ligar(boolean comando) {
		if (comando == true) {
			return true;
		} else {
			return false;
		}

	}
}