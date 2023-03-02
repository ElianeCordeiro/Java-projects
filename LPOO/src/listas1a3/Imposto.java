package listas1a3;
import java.util.Scanner;


public class Imposto {
	public static void main(String[] args) {
		/*
		 * Criar um método que calcule o imposto de renda a partir da renda informada
		 * pelo usuário.
		 */
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o seu salário abaixo. ");
		double salario = leia.nextDouble();

		calcularImposto(salario);
	}

	public static void calcularImposto(double renda) {

		if (renda <= 2000) {
			System.out.println("Você está isento de imposto. Sua renda é até R$2000,00");
		} else if (renda > 2000 && renda <= 3500) {
			double imposto = renda * 15 / 100;
			System.out.println("O total do imposto a ser pago é de " + imposto);
		} else if (renda > 3500 && renda <= 5000) {
			double imposto = renda * 22 / 100;
			System.out.println("O total do imposto a ser pago é de " + imposto);
		} else if (renda > 5000) {
			double imposto = renda * 30 / 100;
			System.out.println("O total do imposto a ser pago é de " + imposto);
		}
	}
}
