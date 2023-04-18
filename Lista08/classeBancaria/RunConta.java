package classeBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class RunConta {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		ArrayList<Conta> contas = new ArrayList<>(10);

		int cpf, numero;
		double saldo;
		String nome;

		Banco banco = null;
		Cliente cliente = null;
		Conta conta = null;

		int menu = 0;

		do {
			System.out.println("------------------------------------------");
			System.out.println("1. Cadastrar conta;\n2. Realizar depósito;\n"
					+ "3. Realizar saque;\n4. Verificar saldo;\n" + "5. Consultar número e nome de agência;\n"
					+ "6. Alterar o número e nome da agência;\n" + "0. Sair.");
			menu = read.nextInt();
			read.nextLine();
			if (menu == 1) {
				System.out.println("Numero da agência: ");
				numero = read.nextInt();
				System.out.println("Nome da agência: ");
				nome = read.nextLine();
				read.nextLine();
				banco = new Banco(numero, nome);

				System.out.println("Nome do cliente: ");
				nome = read.nextLine();
				System.out.println("Número do CPF:");
				cpf = read.nextInt();
				read.nextLine();
				cliente = new Cliente(nome, cpf);

				System.out.println("Número da conta: ");
				numero = read.nextInt();
				System.out.println("Saldo: ");
				saldo = read.nextDouble();

				conta = new Conta(numero, banco, cliente, saldo);
				contas.add(conta);
			} else if (menu == 2) {
				System.out.println("Digite o cpf do cliente para depósito. ");
				cpf = read.nextInt();

				for (Conta conta2 : contas) {
					if (conta2.getCliente().getCpf() == cpf) {
						System.out.println("Qual o valor a ser depositado? ");
						double deposito = read.nextDouble();
						System.out.println("Novo saldo:" + conta2.depositar(deposito));
					} else
						System.out.println("Conta não encontrada!");
				}
			} else if (menu == 3) {
				System.out.println("Digite o cpf do cliente para saque. ");
				cpf = read.nextInt();
				for (Conta conta2 : contas) {
					if (conta2.getCliente().getCpf() == cpf) {
						System.out.println("Qual o valor a ser sacado? ");
						double saque = read.nextDouble();
						System.out.println("Novo saldo:" + conta2.sacar(saque));
					} else
						System.out.println("Conta não encontrada!");
				}
			} else if (menu == 4) {
				System.out.println("Digite o cpf do cliente para consulta de saldo. ");
				cpf = read.nextInt();
				for (Conta conta2 : contas) {
					if (conta2.getCliente().getCpf() == cpf) {
						System.out.println("Saldo " + conta2.getSaldo());
					}
				}
			} else if (menu == 5) {
				System.out.println("Qual o numero da agência? ");
				numero = read.nextInt();
				System.out.println("Qual o nome da agência? ");
				nome = read.nextLine();
				read.nextLine();
				for (Conta conta2 : contas) {
					if(conta2.getBanco().getNomeAgencia().equals(nome) && 
							conta2.getBanco().getNumeroAgencia() == numero) {
						System.out.println(conta2.getCliente().toString());
					}
				}
			} else if(menu ==6) {
				System.out.println("Digite o nome do cliente para alterar os dados. ");
				nome = read.nextLine();
				
				for (Conta conta2 : contas) {
					if(conta2.getCliente().getNome().equals(nome)) {
						System.out.println("Novo numero de agencia: ");
						numero = read.nextInt();
						System.out.println("Novo nome de agencia: ");
						nome = read.nextLine();
						read.nextLine();
						conta2.getBanco().setNumeroAgencia(numero);
						conta2.getBanco().setNomeAgencia(nome);
						System.out.println(conta2.getBanco().toString());
						System.out.println("Dados alterados.");
					} else System.out.println("Cliente não encontrado");
				}
			}

		} while (menu != 0);
		System.out.println("------------Programa Encerrado-----------------");
	}

}
