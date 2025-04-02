package exercicio;

public class Carro extends Veiculo {
	
	int numeroDePortas;
	
	protected Carro(String marca, String modelo, int ano, int numeroDePortas) {
		super(marca, modelo, ano);
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.numeroDePortas = numeroDePortas;
	}
	
	public void abrirPorta() {
		System.out.println("A porta está aberta");
	}
	
	public String toString() {
		return String.format("OS DADOS DO CARRO SÃO: \nMARCA: %s \nMODELO: %s \nANO: %d \nNumero de Portas: %d", marca, modelo, ano, numeroDePortas);
	}
	
}
