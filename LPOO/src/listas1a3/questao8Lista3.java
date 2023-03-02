package listas1a3;
import java.util.ArrayList;
import java.util.Scanner;

public class questao8Lista3 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> vetor = new ArrayList<>(10);
		
		System.out.println("Informe 10 números abaixo. ");
		
		for (int i=0; i<10; i++) {
			System.out.println("Digite o número. ");
			int numero = read.nextInt();
			vetor.add(numero);
		}
		
		System.out.println("Vetor na ordem reversa: ");
		for(int j=(vetor.size()-1); j>=0;j--) {
			System.out.print(vetor.get(j) + " ");
		}
		
		System.out.println("Digite uma frase. ");
		String frase = read.nextLine();
		
		System.out.println(frase);
		
		System.out.println("Sua frase na ordem reversa é ");
		for(int i = frase.length()-1; i>=0; i--) {
			System.out.print(frase.charAt(i) + " ");
		}
		
		
	}
}
