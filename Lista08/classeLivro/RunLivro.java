package classeLivro;

import java.util.ArrayList;
import java.util.Scanner;

public class RunLivro {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		ArrayList<Livro> livros = new ArrayList<>();
		
		Livro livro = null;
		Autor autor = null;
		Editora editora = null;
		
		int menu, anoEdicao, isbn;
		String nome, endereco,titulo;
		long cnpj, cpf, telefone;
		
		
		
		do {System.out.println("-----------------------------------");
			System.out.println("1. cadastrar livro; 2. Buscar livro pelo titulo;"
					+ " 3. Listar todos os livros por autor;"
					+ " 4. Listar todos os livros;"
					+ " 5. Sair.");
			 menu = read.nextInt();
			 read.nextLine();
			 if(menu ==1) {
				System.out.println("Nome do autor. ");
				nome = read.nextLine();
				System.out.println("Endereco do autor. ");
				endereco = read.nextLine();
				System.out.println("CPF do autor");
				cpf = read.nextLong();
				
				autor = new Autor(cpf, nome, endereco);
				read.nextLine();
				System.out.println("Nome da editora? ");
				nome = read.nextLine();
				System.out.println("Telefone da editora: ");
				telefone = read.nextLong();
				System.out.println("CNPJ da editora: ");
				cnpj = read.nextLong();
				System.out.println("Endereco da editora: ");
				endereco = read.nextLine();
				
				editora = new Editora(cnpj, telefone, nome, endereco);
				read.nextLine();
				System.out.println("Titulo do livro: ");
				titulo = read.nextLine();
				System.out.println("ISBN: ");
				isbn = read.nextInt();
				System.out.println("Ano de edição:");
				anoEdicao = read.nextInt();	
				
				livro = new Livro(autor, editora, isbn, anoEdicao, titulo);
				livros.add(livro);
			 }
			 
			 else if(menu ==2) {
				 System.out.println("Qual o titulo do livro que deseja encontrar? ");
				 titulo = read.nextLine();
				 
				 for (Livro livro2 : livros) {
					if(livro2.getTitulo().equals(titulo)) {
						System.out.println("Dados livro: " + livro2.toString());
					}
				}
			 } else if(menu==3) {
				 System.out.println("Qual o nome do autor? ");
				 nome = read.nextLine();
				
				 for (Livro livro2 : livros) {
					if(livro2.getAutor().getNome().equals(nome)) {
						System.out.println(livro2.getTitulo());
					}
				}
			 } else if( menu ==4) {
				 System.out.println("Livros cadastrados: ");
				 for (Livro livro2 : livros) {
					System.out.println(livro2.getTitulo());
				}
			 } else System.out.println("----------PROGRAMA ENCERRADO----------");
			
		} while (menu!=5);
	}

}
