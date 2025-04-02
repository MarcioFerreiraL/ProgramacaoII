package exercicios;

public class Investimento {
	public float taxaJurosAno = 0.1f;
	private float valor = 10000f;
	public int tempoAnos = 5;
	
	public float getTaxaJurosAno() {
		return taxaJurosAno;
	}
	
	public void setTaxaJurosAno(float newTaxaJurosAno) {
		this.taxaJurosAno = newTaxaJurosAno;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float newValor) {
		this.valor = newValor;
	}
	
	public float getTempoAnos() {
		return tempoAnos;
	}
	
	public void setTempoAnos(int newTempoAnos) {
		this.tempoAnos = newTempoAnos;
	}
	
	public float rendimentoValor() {
		return (float) (valor * Math.pow(1 + taxaJurosAno, tempoAnos));
	}
}

/*
⚬ Um método para calcular quanto renderia e retornar ao
usuário o valor (com rendimentos)
*/
