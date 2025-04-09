package exercicio;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0, num3 = 0;
        Scanner ler = new Scanner(System.in);
        List<String> menu = new ArrayList<>();
        List<String> menu2 = new ArrayList<>();
        
        // Configuração dos menus
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
            try {
                System.out.println("\nEscolha a Operacao:");
                
                // Exibir menu principal
                for (String printar : menu) {
                    System.out.println((menu.indexOf(printar) + 1) + " - " + printar);
                }
                System.out.println("");
                
                // Ler escolha do usuário
                int alternativa;
                try {
                    alternativa = ler.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("\nErro: Por favor, digite um número válido.");
                    ler.nextLine(); // Limpar buffer
                    continue;
                }
                System.out.println("");
                
                if (alternativa == 6) {
                    System.out.println("Até Logo! :)");
                    break;
                }
                
                switch (alternativa) {
                    case 1: // Adição
                        try {
                            System.out.print("Digite o primeiro número que deseja somar: ");
                            num1 = ler.nextDouble();
                            System.out.print("Digite o segundo número que deseja somar: ");
                            num2 = ler.nextDouble();
                            Calculadora.somar(num1, num2);
                        } catch (InputMismatchException e) {
                            System.out.println("\nErro: Digite números válidos.");
                            ler.nextLine(); // Limpar buffer
                        }
                        break;
                    
                    case 2: // Subtração
                        try {
                            System.out.print("Digite o primeiro número que deseja subtrair: ");
                            num1 = ler.nextDouble();
                            System.out.print("Digite o segundo número que deseja subtrair: ");
                            num2 = ler.nextDouble();
                            Calculadora.subtrair(num1, num2);
                        } catch (InputMismatchException e) {
                            System.out.println("\nErro: Digite números válidos.");
                            ler.nextLine();
                        }
                        break;
                    
                    case 3: // Multiplicação
                        try {
                            System.out.print("Digite o primeiro número que deseja multiplicar: ");
                            num1 = ler.nextDouble();
                            System.out.print("Digite o segundo número que deseja multiplicar: ");
                            num2 = ler.nextDouble();
                            Calculadora.multiplicar(num1, num2);
                        } catch (InputMismatchException e) {
                            System.out.println("\nErro: Digite números válidos.");
                            ler.nextLine();
                        }
                        break;
                    
                    case 4: // Divisão
                        try {
                            System.out.print("Digite o primeiro número que deseja dividir: ");
                            num1 = ler.nextDouble();
                            System.out.print("Digite o segundo número que deseja dividir: ");
                            num2 = ler.nextDouble();
                            Calculadora.dividir(num1, num2);
                        } catch (InputMismatchException e) {
                            System.out.println("\nErro: Digite números válidos.");
                            ler.nextLine();
                        }
                        break;
                        
                    case 5: // Outros cálculos
                        while (true) {
                            try {
                                System.out.println("\nOutros Cálculos Disponíveis:");
                                for (String printar2 : menu2) {
                                    System.out.println((menu2.indexOf(printar2) + 1) + " - " + printar2);
                                }
                                System.out.println(" ");
                                
                                int alternativa2;
                                try {
                                    alternativa2 = ler.nextInt();
                                } catch (InputMismatchException e) {
                                    System.out.println("\nErro: Por favor, digite um número válido.");
                                    ler.nextLine();
                                    continue;
                                }
                                
                                if (alternativa2 == 11) {
                                    break;
                                }
                                
                                switch (alternativa2) {
                                    case 1: // Bhaskara
                                        try {
                                            System.out.print("Digite o coeficiente (a) da equação: ");
                                            num1 = ler.nextDouble();
                                            System.out.print("Digite o coeficiente (b) da equação: ");
                                            num2 = ler.nextDouble();
                                            System.out.print("Digite o coeficiente (c) da equação: ");
                                            num3 = ler.nextDouble();
                                            String resultadoBhaskara = Calculadora.calcularBhaskara(num1, num2, num3);
                                            System.out.println(resultadoBhaskara);
                                        } catch (InputMismatchException e) {
                                            System.out.println("\nErro: Digite números válidos.");
                                            ler.nextLine();
                                        }
                                        break;
                                        
                                    case 2: // Área do círculo
                                        try {
                                            System.out.print("Digite o raio do círculo: ");
                                            num1 = ler.nextDouble();
                                            String resultadoAreaCirculo = Calculadora.calcularAreaCirculo(num1);
                                            System.out.println(resultadoAreaCirculo);
                                        } catch (InputMismatchException e) {
                                            System.out.println("\nErro: Digite um número válido.");
                                            ler.nextLine();
                                        }
                                        break;
                                        
                                    case 3: // Pitágoras
                                        try {
                                            System.out.print("Digite o valor de um cateto: ");
                                            num1 = ler.nextDouble();
                                            System.out.print("Digite o valor de outro cateto: ");
                                            num2 = ler.nextDouble();
                                            String resultadoPitagoras = Calculadora.calcularPitagoras(num1, num2);
                                            System.out.println(resultadoPitagoras);
                                        } catch (InputMismatchException e) {
                                            System.out.println("\nErro: Digite números válidos.");
                                            ler.nextLine();
                                        }
                                        break;
                                        
                                    case 4: // Volume da esfera
                                        try {
                                            System.out.print("Digite o raio da esfera: ");
                                            num1 = ler.nextDouble();
                                            String resultadoVolumeEsfera = Calculadora.calcularVolumeEsfera(num1);
                                            System.out.println(resultadoVolumeEsfera);
                                        } catch (InputMismatchException e) {
                                            System.out.println("\nErro: Digite um número válido.");
                                            ler.nextLine();
                                        }
                                        break;
                                        
                                    case 5: // Juros compostos
                                        try {
                                            System.out.print("Digite o capital inicial: ");
                                            num1 = ler.nextDouble();
                                            System.out.print("Digite o tempo em anos: ");
                                            int ano = ler.nextInt();
                                            System.out.print("Digite a taxa de juros: ");
                                            num3 = ler.nextDouble();
                                            String resultadoJurosCompostos = Calculadora.calcularJurosCompostos(num1, ano, num3);
                                            System.out.println(resultadoJurosCompostos);
                                        } catch (InputMismatchException e) {
                                            System.out.println("\nErro: Digite valores válidos.");
                                            ler.nextLine();
                                        }
                                        break;
                                        
                                    case 6: // Área do triângulo
                                        try {
                                            System.out.print("Digite o valor da base do triângulo: ");
                                            num1 = ler.nextDouble();
                                            System.out.print("Digite o valor da altura do triângulo: ");
                                            num2 = ler.nextDouble();
                                            String resultadoAreaTriangulo = Calculadora.calcularAreaTriangulo(num1, num2);
                                            System.out.println(resultadoAreaTriangulo);
                                        } catch (InputMismatchException e) {
                                            System.out.println("\nErro: Digite números válidos.");
                                            ler.nextLine();
                                        }
                                        break;
                                        
                                    case 7: // Comprimento da circunferência
                                        try {
                                            System.out.print("Digite o raio da circunferência: ");
                                            num1 = ler.nextDouble();
                                            String resultadoComprimentoCircunferencia = Calculadora.calcularComprimentoCircunferencia(num1);
                                            System.out.println(resultadoComprimentoCircunferencia);
                                        } catch (InputMismatchException e) {
                                            System.out.println("\nErro: Digite um número válido.");
                                            ler.nextLine();
                                        }
                                        break;
                                        
                                    case 8: // Média aritmética
                                        try {
                                            List<Integer> numeros = new ArrayList<>();
                                            while (true) {
                                                System.out.print("Digite um número (0 para parar): ");
                                                int numero = ler.nextInt();
                                                if (numero == 0) {
                                                    if (numeros.isEmpty()) {
                                                        System.out.println("Adicione pelo menos um número antes de parar.");
                                                        continue;
                                                    }
                                                    break;
                                                }
                                                numeros.add(numero);
                                            }
                                            String resultadoMediaAritmetica = Calculadora.calcularMediaAritmetica(numeros);    
                                            System.out.println(resultadoMediaAritmetica);
                                        } catch (InputMismatchException e) {
                                            System.out.println("\nErro: Digite um número inteiro válido.");
                                            ler.nextLine();
                                        }
                                        break;
                                        
                                    case 9: // Fatorial
                                        try {
                                            System.out.print("Digite o número para calcular o fatorial: ");
                                            int numero = ler.nextInt();
                                            String resultadoCalcularFatorial = Calculadora.calcularFatorial(numero);
                                            System.out.println(resultadoCalcularFatorial);
                                        } catch (InputMismatchException e) {
                                            System.out.println("\nErro: Digite um número inteiro válido.");
                                            ler.nextLine();
                                        }
                                        break;
                                        
                                    case 10: // Volume do cilindro
                                        try {
                                            System.out.print("Digite o raio do cilindro: ");
                                            num1 = ler.nextDouble();
                                            System.out.print("Digite a altura do cilindro: ");
                                            num2 = ler.nextDouble();
                                            String resultadoVolumeCilindro = Calculadora.calcularVolumeCilindro(num1, num2);
                                            System.out.println(resultadoVolumeCilindro);
                                        } catch (InputMismatchException e) {
                                            System.out.println("\nErro: Digite números válidos.");
                                            ler.nextLine();
                                        }
                                        break;
                                        
                                    default:
                                        System.out.println("\nOpção inválida. Tente novamente.");
                                }
                            } catch (Exception e) {
                                System.out.println("\nOcorreu um erro inesperado: " + e.getMessage());
                                ler.nextLine();
                            }
                        }
                        break;
                        
                    default:
                        System.out.println("\nOpção inválida. Por favor, escolha uma opção de 1 a 6.");
                }
            } catch (Exception e) {
                System.out.println("\nOcorreu um erro generico: " + e.getMessage());
                ler.nextLine();
            }
        }
        ler.close();
    }
}