package Aula;

public class Explorador implements Mapa, GPS {
	@Override
	public void movimento() {
		System.out.println("Andando...");
	}

	@Override
	public void coordenadas(String direcao) {
		System.out.println(String.format("Andando para a direcao %s"), direcao);	}
	
	@Override
	public void pontos() {
		System.out.println("Pontos marcados no mapa");
	}
}
