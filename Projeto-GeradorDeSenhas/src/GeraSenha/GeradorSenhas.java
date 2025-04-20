package GeraSenha;

public class GeradorSenhas {
	public static void main(String[] args) {
		
		String senhaGerada;
		
		GeraSenhas geradorSenhas = new GeraSenhas();
		senhaGerada = geradorSenhas.gerarSenha();
		
		System.out.println("Senha Gerada: " + senhaGerada);

	}
}
