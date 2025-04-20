package main;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	public List<String> getMenu() {
		List<String> menu = new ArrayList<>();
		
		menu.add("Ver lista de task");
		menu.add("Escrever nova task");
		menu.add("Apagar task");
		menu.add("Sair");
		
		return menu;
	}
	
	public static void limparConsole() {
	    try {
	        if (System.getProperty("os.name").contains("Windows")) {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } else {
	            System.out.print("\033[H\033[2J");
	            System.out.flush();
	        }
	    } catch (Exception e) {
	        for (int i = 0; i < 50; i++) {
	            System.out.println();
	        }
	    }
	}

}
