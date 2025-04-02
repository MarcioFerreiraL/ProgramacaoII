package exercicios;
public class Main {
	public static void main(String[] args) {
		/*Eletronicos dados = new Eletronicos();
		dados.nome = "Computador";
		dados.modelo = "Informatica";
		dados.valor = 1200;
		System.out.println(dados.nome + dados.modelo + dados.valor);*/
		
		// getting e setting
		/*Carro carro0 = new Carro("Fusca Azul", 2000, 1200);
		System.out.println(carro0.getMarcaModelo());
		System.out.println(carro0.getMarcaModelo());
		
		Carro carro0 = new Carro("", 2000, 1200);
		System.out.println(carro0.getMarcaModelo());
		System.out.println(carro0.getMarcaModelo());
		
		Carro carro0 = new Carro("Fusca Azul", 2000, 1200);
		System.out.println(carro0.getMarcaModelo());
		
		
		carro0.buzina();
		carro0.buzina(false);
		carro0.buzina(true);*/
		
		/*Conta dados = new Conta();
		dados.deposito(10000f);
		dados.saque(5000f);
		dados.consultar("cpf");
		dados.consultar("nome");
		dados.consultar("saldo"); */
		
		Investimento dados = new Investimento();
		System.out.println(dados.getTaxaJurosAno());
		System.out.println(dados.getValor());
		System.out.println(dados.getTempoAnos());
		System.out.println(dados.rendimentoValor());


	}
}