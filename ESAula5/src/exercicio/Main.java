package exercicio;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		double num1, num2, num3;
		Scanner ler = new Scanner(System.in);
		List <String> menu = new ArrayList<>();
		List <String> menu2 = new ArrayList<>();
		
		menu.add("Adição");
		menu.add("Subtração");
		menu.add("Multiplicação");
		menu.add("Divisão");
		menu.add("Outros Calculos");
		menu.add("Sair");
		
		menu2.add("Formula de Bhaskara");
		menu2.add("Area do circulo");
		menu2.add("Pitagoras");
		menu2.add("Volume da Esfera");
		menu2.add("Juros Compostos");
		menu2.add("Area do Triangulo");
		menu2.add("Comprimento da Circunferencia");
		menu2.add("Media Aritmetica");
		menu2.add("Fatorial");
		menu2.add("Volume do Cilindro");
		menu2.add("Voltar");

		while (true) {
			
			System.out.println("Escolha a Operacao:");
			
			// printar o menu
			for (String printar : menu) {
				System.out.println((menu.indexOf(printar) + 1) + " - " + printar);
			}
			
			// ler a escolha do usuario
			int alternativa = ler.nextInt();
			;
			
			if (alternativa == 6) {
				System.out.println("Até Logo! :)");
				break;
			}
			
			switch (alternativa) {
			
			case 1: // usuario escolhe soma
				System.out.print("Digite o primeiro numero que voce deseja somar: ");
				num1 = ler.nextDouble();
				System.out.print("Digite o segundo numero que voce deseja somar: ");
				num2 = ler.nextDouble();
				Calculadora.somar(num1, num2);
				break;
			
			case 2: // usuario escolhe subtracao
				System.out.print("Digite o primeiro numero que voce deseja subtrair: ");
				num1 = ler.nextDouble();
				System.out.print("Digite o segundo numero que voce deseja subtrair: ");
				num2 = ler.nextDouble();
				Calculadora.subtrair(num1, num2);
				break;
			
			case 3: // usuario escolhe multiplicacao
				System.out.print("Digite o primeiro numero que voce deseja multiplicar: ");
				num1 = ler.nextDouble();
				System.out.print("Digite o segundo numero que voce deseja multiplicar: ");
				num2 = ler.nextDouble();
				Calculadora.multiplicar(num1, num2);
				break;
			
			case 4: // usuario escolhe divisao
				System.out.print("Digite o primeiro numero que voce deseja dividir: ");
				num1 = ler.nextDouble();
				System.out.print("Digite o segundo numero que voce deseja dividir: ");
				num2 = ler.nextDouble();
				Calculadora.dividir(num1, num2);
				break;
				
			case 5: {
				while (true) {
					for (String printar2 : menu2) {
						System.out.println((menu2.indexOf(printar2) + 1) + " - " + printar2);
					}
					
					int alternativa2 = ler.nextInt();
					
					if (alternativa2 == 11) {
						System.out.println("Até Logo! :)");
						break;
					}
					
					switch (alternativa2) {
						case 1:
							System.out.print("Digite o primero numero(a) da equacao do segundo grau: ");
							num1 = ler.nextDouble();
							System.out.print("Digite o segundo numero(b) da equacao do segundo grau: ");
							num2 = ler.nextDouble();
							System.out.print("Digite o terceiro numero(c) da equacao do segundo grau: ");
							num3 = ler.nextDouble();
							String resultadoBhaskara = Calculadora.calcularBhaskara(num1, num2, num3);
							System.out.println(resultadoBhaskara);
							break;
						case 2:
							System.out.print("Digite o raio do circulo: ");
							num1 = ler.nextDouble();
							String resultadoAreaCirculo = Calculadora.calcularAreaCirculo(num1);
							System.out.println(resultadoAreaCirculo);
							break;
						case 3: 
							System.out.println("Digite o valor de um cateto: ");
							num1 = ler.nextDouble();
							System.out.println("Digite o valor de outro cateto: ");
							num2 = ler.nextDouble();
							String resultadoPitagoras = Calculadora.calcularPitagoras(num1, num2);
							System.out.println(resultadoPitagoras);
						case 4:
							System.out.print("Digite o raio da esfera: ");
							num1 = ler.nextDouble();
							String resultadoVolumeEsfera = Calculadora.calcularVolumeEsfera(num1);
							System.out.println(resultadoVolumeEsfera);
							break;
						case 5:
							System.out.print("Digite o capital inicial a ser investido: ");
							num1 = ler.nextDouble();
							System.out.print("Digite o tempos em anos que o capital ficará aplicado: ");
							int ano = ler.nextInt();
							System.out.print("Digite a taxa de juros que será aplicada sobre o capital: ");
							num3 = ler.nextDouble();
							String resultadoJurosCompostos = Calculadora.calcularJurosCompostos(num1, ano, num3);
							System.out.println(resultadoJurosCompostos);
							break;
						case 6:
							System.out.println("Digite o valor da base do tringulo: ");
							num1 = ler.nextDouble();
							System.out.println("Digite o valor da altura do tringulo:");
							num2 = ler.nextDouble();
							String resultadoAreaTriangulo = Calculadora.calcularAreaTriangulo(num1, num2);
							System.out.println(resultadoAreaTriangulo);
							break;
						case 7: 
							System.out.print("Digite o raio da circunferencia: ");
							num1 = ler.nextDouble();
							String resultadoComprimentoCircunferencia = Calculadora.calcularComprimentoCircunferencia(num1);
							System.out.println(resultadoComprimentoCircunferencia);
							break;
						case 8:
							List <Integer> numeros = new ArrayList<>();
							while (true) {
								System.out.println("Digite um numero para adicionar a media aritmetica (digite 0 para parar)");
								int numero = ler.nextInt();
								if (numero == 0) {
									break;
								}
								numeros.add(numero);
								String resultadoMediaAritmetica = Calculadora.calcularMediaAritmetica(numeros);	
								System.out.println(resultadoMediaAritmetica);
								break;
							}
						case 9:
							System.out.print("Digite o numero para calcular o faotrial do mesmo: ");
							int numero = ler.nextInt();
							String resultadoCalcularFatorial = Calculadora.calcularFatorial(numero);
							System.out.println(resultadoCalcularFatorial);
							break;
						case 10: 
							System.out.print("Digite o raio da cilindro: ");
							num1 = ler.nextDouble();
							System.out.print("Digite a altura do cilindro: ");
							num2 = ler.nextDouble();
							String resultadoVolumeCilindro = Calculadora.calcularVolumeCilindro(num1, num2);
							System.out.println(resultadoVolumeCilindro);
							break;
						}	
					
				}
			ler.close();
		}
			}		
}
}
}