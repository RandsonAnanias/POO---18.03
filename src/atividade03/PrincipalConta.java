package atividade03;

import java.util.Scanner;

public class PrincipalConta {
		public static void main(String[] args) {
		
		ContaCorrente ct1 = new ContaCorrente();
		
		System.out.println();
		Scanner entrada = new Scanner (System.in);


		int opcao;
		do {
			
			System.out.println("\n   =========================");
			System.out.println("    1 - Saldo         |");
			System.out.println("    2 - Deposito      |");
			System.out.println("    3 - Saque         |");
			System.out.println("    0 - Sair          |");
			System.out.println("   =========================\n");
			opcao = entrada.nextInt();
			
			System.out.print("\n");
			
			switch (opcao) {
			case 1:
				ct1.setSaldo(0);
				ct1.mostrarSaldo();
				break;
			case 2:
				double Valor = entrada.nextDouble();
				ct1.Depositar(Valor);
				ct1.mostrarSaldo();
				break;
			case 3:
				double Valor1 = entrada.nextDouble();
				ct1.Sacar(Valor1);
				ct1.mostrarSaldo();
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}

}
