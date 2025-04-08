package exercicio;

import java.util.List;

public class Calculadora {
	public static int operacoesRealizadas;
	
	public static void multiplicar(double num1, double num2) {
		operacoesRealizadas++;
		String printar = String.format("O resultado é: %.2f",num1 * num2);
		System.out.println(printar);
	}
	
	public static void somar(double num1, double num2) {
		operacoesRealizadas++;
		String printar = String.format("O resultado é: %.2f",num1 + num2);
		System.out.println(printar);
	}
	
	public static void subtrair(double num1, double num2) {
		operacoesRealizadas++;
		String printar = String.format("O resultado é: %.2f",num1 - num2);
		System.out.println(printar);
	}
	
	public static void dividir(double num1, double num2) {
		operacoesRealizadas++;
		String printar = String.format("O resultado é: %.2f",num1 / num2);
		System.out.println(printar);
	}
	
	public static String calcularBhaskara(double a, double b, double c) {
		double delta = (b*b) - 4 * a * c;
		double x1 = -(b) + Math.sqrt(delta)/(2 * a);
		double x2 = -(b) - Math.sqrt(delta)/(2 * a);
		return String.format("O valor de X1 é de: %.2f\nO valor de X2 é de: %.2f", x1, x2);
	}
	
	public static String calcularAreaCirculo(double r) {
		double resultado = Math.PI * Math.pow(r, 2);
		return String.format("A área do circulo é: %.2f", resultado);
	}
	
	public static String calcularPitagoras(double a, double b) {
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return String.format("O valor da hipotenusa é: %.2f", c);
	}
	
	public static String calcularVolumeEsfera(double r) {
		double resultado = 4 * (Math.PI * Math.pow(r, 3)) / 3;
		return String.format("A volume da esfera é: %.2f", resultado);
	}
	
	public static String calcularJurosCompostos(double valor, int ano, double taxa) {
		double resultado = valor * Math.pow((1 + taxa), ano);
		return String.format("A montante ao final será de: %.2f", resultado);
	}
	
	public static String calcularAreaTriangulo(double a, double h) {
		double resultado = a * h / 2;
		return String.format("A area do tringulo é: %.2f", resultado);
	}
	
	public static String calcularComprimentoCircunferencia(double r) {
		double resultado = 2 * Math.PI * r;
		return String.format("O comprimento desta cricunferencia é: %.2f", resultado);
	}
	
	public static String calcularFatorial(int fatorial) {
		int resultadoFatorial = 1;
	    for (int i = 1; i <= fatorial; i++) {
	    	resultadoFatorial *= i;
	    }
	    return String.format("O resulto desse fatorial é: %d", resultadoFatorial);
	}
	
	public static String calcularMediaAritmetica(List<Integer> lista) {
		int valorTotal = 0;
		for (int numero : lista) {
			valorTotal += numero;
		}
		double resultado = valorTotal / lista.size();
		return String.format("A media aritmetica é: %.2f", resultado);
 	}	
	
	public static String calcularVolumeCilindro(double r, double h) {
		double resultado = Math.PI * Math.pow(r, 2) * h;
		return String.format("A volume do cilindro é: %.2f", resultado);
	}
}
