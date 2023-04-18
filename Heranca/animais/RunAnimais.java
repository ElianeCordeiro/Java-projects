package animais;

import java.util.ArrayList;
import java.util.Scanner;

public class RunAnimais {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		ArrayList<Animal> animais = new ArrayList<>();
		
		Peixe peixe = null;
		Mamifero mamifero = null;
		
		
		int menu = 0;
		String nome;
		long comprimento;
		float velocidade;
		int numero_patas;
		String cor, ambiente, alimento;
		
		
		
		do {
			System.out.println("Qual ação deseja realizar? "
					+ " 1. Incluir dados relativos a um peixe;"
					+ " 2. Incluir dados relativos a um mamífero;"
					+ " 3. Listar todos os animais cadastrados;"
					+ " 4. Listar todos os peixes cadastrados. "
					+ " 0. Sair;");
			menu = read.nextInt();
			
			if(menu==1) {
				read.nextLine();
				System.out.println("Informe o nome do peixe. ");
				nome = read.nextLine();
				System.out.println("Informe o comprimento dele.");
				comprimento = read.nextLong();
				System.out.println("Qual a velocidade em m/s?");
				velocidade = read.nextFloat();
				System.out.println("O peixe tem barbatanas? true/false");
				boolean barbatanas = read.nextBoolean();
				if(barbatanas == true) {
					peixe.setBarbatanas(true);
				} else {peixe.setBarbatanas(false);}
				System.out.println("O peixe tem cauda? true/false");
				boolean cauda = read.nextBoolean();
				if(cauda == true) {
					peixe.setCauda(true);
				} else {peixe.setCauda(false);}
				peixe = new Peixe(nome, comprimento, 0, "cinza", "mar", velocidade, barbatanas, cauda);
				animais.add(peixe);
			} else if(menu==2) {
				read.nextLine();
				System.out.println("Informe o nome do mamifero. ");
				nome = read.nextLine();
				System.out.println("Informe o comprimento dele.");
				comprimento = read.nextLong();
				System.out.println("Qual o numero de patas? ");
				numero_patas = read.nextInt();
				read.nextLine();
				System.out.println("Qual a cor?");
				cor = read.nextLine();
				System.out.println("Qual a velocidade em m/s?");
				velocidade = read.nextFloat();
				System.out.println("Qual o alimento preferido dele? ");
				alimento = read.nextLine();
				mamifero = new Mamifero(nome, comprimento, numero_patas, cor, "terra", velocidade, alimento);
				animais.add(mamifero);
				read.nextLine();
			} else if(menu == 3) {
				for (Animal animal : animais) {
					System.out.println("Dados do animal cadastrados: ");
					System.out.println("------------------------------");
					System.out.println("Nome: "+ animal.getNome());
					System.out.println("Comprimento: "+animal.getComprimento());
					System.out.println("Número de patas: "+animal.getNumero_patas());
					System.out.println("Cor: "+animal.getCor());
					System.out.println("Ambiente: "+animal.getAmbiente());
					System.out.println("Velocidade: "+animal.getVelocidade_ms());
					if(animal instanceof Peixe == true){
						System.out.println("Barbatanas: "+ ((Peixe)animal).isBarbatanas());
						System.out.println("Cauda: "+ ((Peixe)animal).isCauda());
					} else if (animal instanceof Mamifero == true) {
						System.out.println("Alimento: "+((Mamifero)animal).getAlimento());
					}
				}
			} else if(menu == 4) {
				for (Animal animal : animais) {
					if(animal instanceof Peixe == true) {
						System.out.println("Dados do animal cadastrados: ");
						System.out.println("------------------------------");
						System.out.println("Nome: "+ animal.getNome());
						System.out.println("Comprimento: "+animal.getComprimento());
						System.out.println("Número de patas: "+animal.getNumero_patas());
						System.out.println("Cor: "+animal.getCor());
						System.out.println("Ambiente: "+animal.getAmbiente());
						System.out.println("Velocidade: "+animal.getVelocidade_ms());
						System.out.println("Barbatanas: "+ ((Peixe)animal).isBarbatanas());
						System.out.println("Cauda: "+ ((Peixe)animal).isCauda());
					}
				}
			}
			
		} while (menu!=0);
	}

}
