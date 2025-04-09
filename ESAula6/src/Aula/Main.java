package Aula;

public class Main {
	public static void main(String[] args) {
		Animal bixo = new Cachorro();
		bixo.fazerSom();
		
		bixo = new Gato();
		bixo.fazerSom();
	}
}
