package exercicio;

public class Calculadora {
	public static int operacoesRealizadas;
	
	public static String multiplicar(double num1, double num2) {
		operacoesRealizadas++;
		return String.format("O resultado é: %.2f",num1 * num2);
	}
	
	
}
