package GeraSenha;

import java.util.ArrayList;
import java.util.List;

public class GeraSenhas {
	
	List<String> letrasMaiusculas = new ArrayList<>();
    List<String> letrasMinusculas = new ArrayList<>();
    List<String> numeros = new ArrayList<>();
    List<String> especiais = new ArrayList<>();
    List<String> senha = new ArrayList<>();
    List<List> conjunto = new ArrayList<>();
    
    public String gerarSenha() {
    
	    // Letras maiúsculas de A a Z
	    for (char c = 'A'; c <= 'Z'; c++) {
	        letrasMaiusculas.add(String.valueOf(c));
	    }
	
	    // Letras minúsculas de a a z
	    for (char c = 'a'; c <= 'z'; c++) {
	        letrasMinusculas.add(String.valueOf(c));
	    }
	
	    // Números de 0 a 9
	    for (int i = 0; i <= 9; i++) {
	        numeros.add(String.valueOf(i));
	    }
	
	    // Caracteres especiais
	    String especiaisStr = "!@#$%&*?";
	    for (char c : especiaisStr.toCharArray()) {
	        especiais.add(String.valueOf(c));
	    }
	    
	    conjunto.add(letrasMaiusculas);
	    conjunto.add(letrasMinusculas);
	    conjunto.add(numeros);
	    conjunto.add(especiais);
	    
	    for (int i = 0; i < 10; i++) {
	    	int randomConjunto;
	    	randomConjunto = (int) (Math.random() * conjunto.size());
	    	
	    	switch (randomConjunto) {
	    	
	    	case 0:
	    	    int randomMaiuscula = (int) (Math.random() * letrasMaiusculas.size());
	    	    senha.add(letrasMaiusculas.get(randomMaiuscula));
	    	    break;
	    	case 1:
	    	    int randomMinuscula = (int) (Math.random() * letrasMinusculas.size());
	    	    senha.add(letrasMinusculas.get(randomMinuscula));
	    	    break;
	    	case 2:
	    	    int randomNumero = (int) (Math.random() * numeros.size());
	    	    senha.add(numeros.get(randomNumero));
	    	    break;
	    	case 3:
	    	    int randomEspecial = (int) (Math.random() * especiais.size());
	    	    senha.add(especiais.get(randomEspecial));
	    	    break;
	    	default:
	    		System.out.println("Erro");
	    		
	    	}
	    }
	    
	    StringBuilder senhaFinal = new StringBuilder();
	    for (String caractere : senha) {
	        senhaFinal.append(caractere);
	    }
	    
	    return senhaFinal.toString();
	     
}
}