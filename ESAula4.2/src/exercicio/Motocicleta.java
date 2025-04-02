package exercicio;

public class Motocicleta extends Veiculo {
	
	String tipoDeGuidao;
	
	public Motocicleta(String marca, String modelo, int ano, String tipoDeGuidao) {
		super(marca, modelo, ano);
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.tipoDeGuidao = tipoDeGuidao;
	}
	
	public boolean empinar(boolean comando) {
		if (comando == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return String.format("\nOS DADOS DA MOTOCILETA SÃO: \nMARCA: %s \nMODELO: %s \nANO: %d \nTipo De Guidão: %s", marca, modelo, ano, tipoDeGuidao);
	}
}
