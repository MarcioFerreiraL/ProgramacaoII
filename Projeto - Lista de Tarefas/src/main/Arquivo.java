package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Arquivo {

    public List<String> lerArquivo(Path caminhoArquivo) {
        List<String> conteudo = new ArrayList<>();
        try {
            conteudo = Files.readAllLines(caminhoArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
        return conteudo;
    }

    public void escreverArquivo(Path caminhoArquivo, Scanner ler) {
        try {
            while (true) {
                System.out.println("O que deseja adicionar à lista? Digite 0 para parar.");
                String resposta = ler.nextLine();

                if ("0".equals(resposta)) {
                    break;
                }

                try {
                    Files.writeString(caminhoArquivo, resposta + System.lineSeparator(), StandardOpenOption.APPEND);
                } catch (IOException e) {
                    System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println("Erro inesperado durante escrita: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void apagarLinhaArquivo(Path caminhoArquivo, Scanner ler) {
        try {
            List<String> conteudo = lerArquivo(caminhoArquivo);

            if (conteudo.isEmpty()) {
                System.out.println("O arquivo está vazio. Nada para remover.");
                return;
            }

            System.out.println("Lista de tarefas:");
            for (int i = 0; i < conteudo.size(); i++) {
                System.out.println((i + 1) + " - " + conteudo.get(i));
            }

            System.out.print("\nDigite o número da linha que deseja apagar: ");
            int linhaRemover;

            try {
                linhaRemover = ler.nextInt();
                ler.nextLine(); // limpar o buffer
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número inteiro válido.");
                ler.nextLine();
                return;
            }

            if (linhaRemover < 1 || linhaRemover > conteudo.size()) {
                System.out.println("Número de linha inválido.");
                return;
            }

            conteudo.remove(linhaRemover - 1);

            try {
                Files.write(caminhoArquivo, conteudo);
                System.out.println("\nLinha removida com sucesso.\n");
            } catch (IOException e) {
                System.out.println("Erro ao reescrever o arquivo: " + e.getMessage());
                e.printStackTrace();
            }

        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
