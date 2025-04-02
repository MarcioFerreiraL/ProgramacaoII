package exercicio;

public class Main {
	public static void main(String[] args) {
		/*Cachorro dados = new Cachorro("Cachorro", "Padrao");
		System.out.println(dados.toString()); 
		
		Funcionario funcionario = new Funcionario("Zé", 70, "Cozinheiro", 1518);
		String printarFuncionario = funcionario.getNome() + ' ' + funcionario.getIdade() + ' ' + funcionario.getCargo() + ' '  + funcionario.getSalario();
		System.out.println(printarFuncionario); */
		
		Carro carro = new Carro("Fiat", "Uno", 2005, 4);
		System.out.println(carro.toString());
		
		Motocicleta moto = new Motocicleta("Honda", "Pop 100", 2007, "De bicicleta");
		System.out.println(moto.toString());
		
		System.out.println(carro.acelerar());
		System.out.println(carro.ligar(true));
		carro.abrirPorta();
		
		System.out.println(moto.acelerar());
		System.out.println(moto.ligar(false));
		System.out.println(moto.empinar(true));
	}
}
