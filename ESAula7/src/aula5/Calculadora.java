package aula5;

import java.util.List;

public class Calculadora {
    
    public static void multiplicar(double num1, double num2) {
        try {
            String printar = String.format("\nO resultado é: %.2f", num1 * num2);
            System.out.println(printar);
        } catch (Exception e) {
            System.out.println("\nErro ao multiplicar: " + e.getMessage());
        }
    }
    
    public static void somar(double num1, double num2) {
        try {
            String printar = String.format("\nO resultado é: %.2f", num1 + num2);
            System.out.println(printar);
        } catch (Exception e) {
            System.out.println("\nErro ao somar: " + e.getMessage());
        }
    }
    
    public static void subtrair(double num1, double num2) {
        try {
            String printar = String.format("\nO resultado é: %.2f", num1 - num2);
            System.out.println(printar);
        } catch (Exception e) {
            System.out.println("\nErro ao subtrair: " + e.getMessage());
        }
    }
    
    public static void dividir(double num1, double num2) {
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            String printar = String.format("\nO resultado é: %.2f", num1 / num2);
            System.out.println(printar);
        } catch (ArithmeticException e) {
            System.out.println("\nErro na divisão: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nErro ao dividir: " + e.getMessage());
        }
    }
    
    public static String calcularBhaskara(double a, double b, double c) {
        try {
            if (a == 0) {
                throw new ArithmeticException("O coeficiente 'a' não pode ser zero.");
            }
            
            double delta = (b*b) - 4 * a * c;
            
            if (delta < 0) {
                throw new ArithmeticException("A equação não possui raízes reais (delta < 0).");
            }
            
            double x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
            double x2 = (-(b) - Math.sqrt(delta)) / (2 * a); 
            
            return String.format("\nO valor de X1 é de: %.2f\nO valor de X2 é de: %.2f", x1, x2);
        } catch (ArithmeticException e) {
            return "\nErro ao calcular Bhaskara: " + e.getMessage();
        } catch (Exception e) {
            return "\nErro inesperado ao calcular: " + e.getMessage();
        }
    }
    
    public static String calcularAreaCirculo(double r) {
        try {
            if (r <= 0) {
                throw new ArithmeticException("O raio deve ser maior que zero.");
            }
            double resultado = Math.PI * Math.pow(r, 2);
            return String.format("\nA área do circulo é: %.2f", resultado);
        } catch (ArithmeticException e) {
            return "\nErro ao calcular área do círculo: " + e.getMessage();
        } catch (Exception e) {
            return "\nErro inesperado ao calcular área do círculo: " + e.getMessage();
        }
    }
    
    public static String calcularPitagoras(double a, double b) {
        try {
            if (a <= 0 || b <= 0) {
                throw new ArithmeticException("Os catetos devem ser maiores que zero.");
            }
            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            return String.format("\nO valor da hipotenusa é: %.2f", c);
        } catch (ArithmeticException e) {
            return "\nErro ao calcular Pitágoras: " + e.getMessage();
        } catch (Exception e) {
            return "\nErro inesperado ao calcular Pitágoras: " + e.getMessage();
        }
    }
    
    public static String calcularVolumeEsfera(double r) {
        try {
            if (r <= 0) {
                throw new ArithmeticException("O raio deve ser maior que zero.");
            }
            double resultado = (4.0/3.0) * Math.PI * Math.pow(r, 3);
            return String.format("\nO volume da esfera é: %.2f", resultado);
        } catch (ArithmeticException e) {
            return "\nErro ao calcular volume da esfera: " + e.getMessage();
        } catch (Exception e) {
            return "\nErro inesperado ao calcular volume da esfera: " + e.getMessage();
        }
    }
    
    public static String calcularJurosCompostos(double valor, int ano, double taxa) {
        try {
            if (valor <= 0) {
                throw new ArithmeticException("O valor inicial deve ser maior que zero.");
            }
            if (ano <= 0) {
                throw new ArithmeticException("O período em anos deve ser maior que zero.");
            }
            if (taxa < 0) {
                throw new ArithmeticException("A taxa de juros não pode ser negativa.");
            }
            
            double resultado = valor * Math.pow((1 + taxa), ano);
            return String.format("\nO montante ao final será de: %.2f", resultado);
        } catch (ArithmeticException e) {
            return "\nErro ao calcular juros compostos: " + e.getMessage();
        } catch (Exception e) {
            return "\nErro inesperado ao calcular juros compostos: " + e.getMessage();
        }
    }
    
    public static String calcularAreaTriangulo(double a, double h) {
        try {
            if (a <= 0 || h <= 0) {
                throw new ArithmeticException("A base e altura devem ser maiores que zero.");
            }
            double resultado = (a * h) / 2;
            return String.format("\nA área do triângulo é: %.2f", resultado);
        } catch (ArithmeticException e) {
            return "\nErro ao calcular área do triângulo: " + e.getMessage();
        } catch (Exception e) {
            return "\nErro inesperado ao calcular área do triângulo: " + e.getMessage();
        }
    }
    
    public static String calcularComprimentoCircunferencia(double r) {
        try {
            if (r <= 0) {
                throw new ArithmeticException("O raio deve ser maior que zero.");
            }
            double resultado = 2 * Math.PI * r;
            return String.format("\nO comprimento desta circunferência é: %.2f", resultado);
        } catch (ArithmeticException e) {
            return "\nErro ao calcular comprimento da circunferência: " + e.getMessage();
        } catch (Exception e) {
            return "\nErro inesperado ao calcular comprimento da circunferência: " + e.getMessage();
        }
    }
    
    public static String calcularFatorial(int fatorial) {
        try {
            if (fatorial < 0) {
                throw new ArithmeticException("Não existe fatorial de número negativo.");
            }
            
            long resultadoFatorial = 1;
            for (int i = 1; i <= fatorial; i++) {
                resultadoFatorial *= i;
            }
            return String.format("\nO resultado desse fatorial é: %d", resultadoFatorial);
        } catch (ArithmeticException e) {
            return "\nErro ao calcular fatorial: " + e.getMessage();
        } catch (Exception e) {
            return "\nErro inesperado ao calcular fatorial: " + e.getMessage();
        }
    }
    
    public static String calcularMediaAritmetica(List<Integer> lista) {
        try {
            if (lista == null || lista.isEmpty()) {
                throw new ArithmeticException("A lista não pode ser vazia.");
            }
            
            int valorTotal = 0;
            for (int numero : lista) {
                valorTotal += numero;
            }
            double resultado = (double) valorTotal / lista.size();
            return String.format("\nA média aritmética é: %.2f", resultado);
        } catch (ArithmeticException e) {
            return "\nErro ao calcular média: " + e.getMessage();
        } catch (Exception e) {
            return "\nErro inesperado ao calcular média: " + e.getMessage();
        }
    }    
    
    public static String calcularVolumeCilindro(double r, double h) {
        try {
            if (r <= 0 || h <= 0) {
                throw new ArithmeticException("O raio e altura devem ser maiores que zero.");
            }
            double resultado = Math.PI * Math.pow(r, 2) * h;
            return String.format("\nO volume do cilindro é: %.2f", resultado);
        } catch (ArithmeticException e) {
            return "\nErro ao calcular volume do cilindro: " + e.getMessage();
        } catch (Exception e) {
            return "\nErro inesperado ao calcular volume do cilindro: " + e.getMessage();
        }
    }
}