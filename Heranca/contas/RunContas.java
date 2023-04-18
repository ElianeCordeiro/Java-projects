package contas;

import java.util.ArrayList;
import java.util.Scanner;

public class RunContas {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		ArrayList<ContaBancaria> contas = new ArrayList<>(5);
		
		ContaBancaria contaB = null;
		ContaPoupanca contaP = null;
		ContaEspecial contaE = null;
		
		int menu = 0;
		
		do {
			System.out.println("Qual ação deseja realizar? "
					+ " 1. Incluir dados de conta;"
					+ " 2. Sacar;"
					+ " 3. Depositar;"
					+ " 4. Mostrar novo saldo de quem tem conta Poupança a partir de rendimento; "
					+ " 5. Mostrar todas as contas cadastradas. ");
			menu = read.nextInt();
			
			String cliente;
			int numero_conta;
			double saldo;
			int dia_rendimento;
			double limite;
			
			if(menu==1) {
				System.out.println("Qual tipo de conta deseja incluir os dados: "
						+ " 1. Bancaria;"
						+ " 2. Poupança;"
						+ " 3. Especial.");
				int opcao = read.nextInt();
				read.nextLine();
				if(opcao == 1) {
					System.out.println("Qual o nome do cliente? ");
					cliente = read.nextLine();
					System.out.println("Qual o numero da conta de " + cliente);
					numero_conta = (read.nextInt());
					System.out.println("Qual o saldo da conta? ");
					saldo = read.nextDouble();
					contaB = new ContaBancaria(cliente, numero_conta, saldo);
					contas.add(contaB);
				} else if(opcao == 2) {
					System.out.println("Qual o nome do cliente? ");
					cliente = read.nextLine();
					System.out.println("Qual o numero da conta de " + cliente);
					numero_conta = read.nextInt();
					System.out.println("Qual o saldo da conta? ");
					saldo = read.nextDouble();
					System.out.println("Qual o dia do rendimento? ");
					dia_rendimento = read.nextInt();
					contaP = new ContaPoupanca(cliente, numero_conta, saldo, dia_rendimento);
					contas.add(contaP);
				} else if(opcao == 3) {
					System.out.println("Qual o nome do cliente? ");
					cliente = read.nextLine();
					System.out.println("Qual o numero da conta de " + cliente);
					numero_conta = read.nextInt();
					System.out.println("Qual o saldo da conta? ");
					saldo = read.nextDouble();
					System.out.println("Qual o limite para saldo negativo? ");
					limite = read.nextDouble();
					contaE = new ContaEspecial(cliente, numero_conta, saldo, limite);
					contas.add(contaE);
				}
			} else if(menu == 2) {
				System.out.println("Qual o numero da conta para saque? ");
				int num_conta = read.nextInt();
				
				for (ContaBancaria conta : contas) {
					if(num_conta == conta.getNumero_conta()) {
						System.out.println("Informe o valor a ser sacado. ");
						conta.sacar(read.nextDouble());
						System.out.println("O saldo atual é de " + conta.getSaldo());
					}
				}
			}else if(menu == 3) {
				System.out.println("Qual o numero da conta para deposito? ");
				int num_conta = read.nextInt();
				
				for (ContaBancaria conta : contas) {
					if(num_conta == conta.getNumero_conta()) {
						System.out.println("Informe o valor a ser depositado. ");
						conta.depositar(read.nextDouble());
						System.out.println("O saldo atual é de " + conta.getSaldo());
					} 
				}
			} else if(menu ==4) {
				for (ContaBancaria conta : contas) {
					if(conta instanceof ContaPoupanca == true) {
						System.out.println("Informe o rendimento da conta poupanca de " + conta.getCliente());
						double rendimento = read.nextDouble();
						System.out.println("O novo saldo é " + ((ContaPoupanca) conta).calcularNovoSaldo(rendimento));
					}
				}
			} else if(menu == 5) {
				for (ContaBancaria conta : contas) {
					System.out.println("-------------------------------");
					System.out.println("Dados da conta: ");
					System.out.println("-------------------------------");
					System.out.println("Nome: " + conta.getCliente());
					System.out.println("Número da conta: " + conta.getNumero_conta());
					System.out.println("Saldo: " + conta.getSaldo());
					if (conta instanceof ContaPoupanca == true) {
						System.out.println("Dia de rendimento: "+ ((ContaPoupanca) conta).getDia_rendimento());
					} else if(conta instanceof ContaEspecial == true) {
						System.out.println("Limite de saldo negativo: "+ ((ContaEspecial) conta).getLimite());
					}
					System.out.println("-------------------------------");
				}
			}
			
			
		} while (menu!=0);
		
		
	}

}
