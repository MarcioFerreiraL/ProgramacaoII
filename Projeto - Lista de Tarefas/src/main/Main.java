package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Arquivo arquivo = new Arquivo();
		Path caminhoArquivo = Path.of("toDo.txt");
		List<String> toDo = new ArrayList<>();
		List<String> menu = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		
		if (Files.notExists(caminhoArquivo)) {
			Files.createFile(caminhoArquivo);
			System.out.println("Arquivo criado com sucesso!");
		}
		
		try {
						
			while (true) {
				
				Menu menuPrintar = new Menu();
				menu = menuPrintar.getMenu();
				
				for (String printar : menu) {
					System.out.println((menu.indexOf(printar) + 1) + " - " + printar);
				}	
				
				System.out.print("\nO que deseja fazer? ");
				
                int alternativa;
				try {
                    alternativa = ler.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("\nErro: Por favor, digite um número válido.");
                    ler.nextLine();
                    continue;
                }
				
                switch (alternativa) {
					
					case 1:
						
						System.out.println("\nLISTA DE TAREFAS:");
						toDo = arquivo.lerArquivo(caminhoArquivo);
						System.out.println("");
						for (String printar : toDo) {
							System.out.println((toDo.indexOf(printar) + 1) + " - " + printar);
						}
						System.out.println("");
						break;
						
					case 2:
						ler.nextLine();
						arquivo.escreverArquivo(caminhoArquivo, ler);
	                    break;
						
					case 3:
						
						arquivo.apagarLinhaArquivo(caminhoArquivo, ler);
						break;
						
					case 4:
						
						System.out.println("Saindo...");
						return;
						
			        default:
			            System.out.println("Opção inválida.");
			            
					}
	            if (alternativa == 4) {
	            	break;
	            }
			} 
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			ler.close();
		}
		
	}
}

