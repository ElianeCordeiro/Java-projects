package listas1a3;
import java.util.Scanner;

public class Temperatura {
	
	/*
	 * Criar métodos que convertam as temperaturas em Fahrenheit ou Kelvin para
	 * Celsius. Deve ser fornecida qual ação o usuário deseja realizar.
	 */
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Forneça a opção que deseja realizar."
				+ "1. Transformar de Fahrenheit para Celsius;"
				+ "2. Transformar de Kelvin para Celsius. ");
		int escolha = leia.nextInt();
		
		if(escolha == 1) {
			System.out.println("Digite a temperatura em Fahrenheit para fazer a conversão. ");
			double fahrenheit = leia.nextDouble();
			System.out.print("A temperatura " + fahrenheit+ "ºF em graus Celsius é " );
			fahrenheitToCelsius(fahrenheit);
		}
		
		else if(escolha == 2) {
			System.out.println("Digite a temperatura em Kelvin para fazer a conversão. ");
			double kelvin = leia.nextDouble();
			System.out.print("A temperatura " + kelvin + "K em graus Celsius é " );
			kelvinToCelsius(kelvin);
		}
		else {System.out.println("Operação inválida. ");}
		
	}
	
	public static void fahrenheitToCelsius(double F) {
		
		double C = 5 * (F - 32)/ 9;
		System.out.printf("%.1f",C);
	}
	
	public static void kelvinToCelsius(double K) {
		
		double C = (K - 273);
		System.out.printf("%.1f",C);
	}
	
}
