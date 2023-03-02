package listas1a3;
import java.util.ArrayList;
import java.util.Scanner;

public class Media {
	
	/*
	 * Criar um método que calcule a média dos valores informados pelo usuário. A
	 * quantidade de valores deve ser informada pelo usuário.
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Double> valores = new ArrayList<>();
		Scanner leia = new Scanner(System.in);		
		System.out.println("Informe a quantidade de valores a serem inseridos. ");
		double tamanho = leia.nextDouble();
		
		for (int i = 0; i <tamanho; i++) {
			System.out.println("Informe o valor abaixo. ");
			double valor = leia.nextInt();
			valores.add(valor);
		}
		System.out.print("A média dos valores no vetor é ");
		calcularMedia(valores);
	}
	
	public static void calcularMedia(ArrayList<Double> vetor) {
		double soma = 0;
		for (double valor: vetor) {
			soma = valor + soma;
		}
		double media = soma / vetor.size();
		System.out.printf("%.1f",media);
		
	}

}
