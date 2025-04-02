package exercicio;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List <String> menu = new ArrayList<>();
		menu.add("-----------------------------");
		menu.add("            MENU");
		menu.add("-----------------------------");
		menu.add("      1 - Adição");
		menu.add("      2 - Subtração");
		menu.add("      3 - Multiplicação");
		menu.add("      4 - Divisão");
		menu.add("-----------------------------");

		for (String printar : menu) {
			System.out.println(printar);
		}
		int escolha = ler.nextInt();
		ler.close();
		if (escolha == 1) {
			;
		}
	
	}
}
