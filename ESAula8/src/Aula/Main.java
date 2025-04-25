package Aula;

public class Main {
	public static void main(String[] args) {
		Camarelo late = new Camarelo();
		late.som();
		late.dormir();
		late.carinho();
		
		Explorador explorador = new Explorador();
		explorador.coordenadas("Norte");
		explorador.movimento();
	}
}
