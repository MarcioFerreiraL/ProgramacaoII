package exercicios;

public class Conta {
	public String cpf = "111.111.111-11";
	public String nome = "Teste";
	private float saldo = 0;
	
	private float valor;
	
	private void setSaldo(float novoValorSaldo) {
		this.saldo = novoValorSaldo;
	}
	
	public void saque(float valorParaSacar) {
		this.valor = valorParaSacar;
		setSaldo(saldo - valor);
		System.out.println("Valor Sacado com sucesso!");
}
	public void deposito(float valorParaDepositar) {
		this.valor = valorParaDepositar;
		setSaldo(saldo + valor);
		System.out.println("Valor Depositado com sucesso!");		
}
	
	public void consultar(String escolha) {
		if (escolha == "nome") {
			System.out.println(nome);
		} else if(escolha == "cpf"){
			System.out.println(cpf);
		} else if (escolha == "saldo") {
			System.out.println(saldo);
		}
		
	}
}
