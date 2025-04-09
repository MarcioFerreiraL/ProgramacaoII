package Aula;

public class Teste {
	public static void main(String[] args) {
		try {
			int resultado = 10 / 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}