package atividade02;

import java.util.Scanner;

public class PrincipalPessoa {
		public static void main(String[] args) {
			Pessoa ps = new Pessoa();
			//System.out.println();
			System.out.println();
			Scanner entrada = new Scanner (System.in);
			int opcao;
			do {
				
				System.out.println("\n  =========================");
				System.out.println("   1 - Nome          |");
				System.out.println("   2 - Sexo          |");
				System.out.println("   3 - Idade         |");
				System.out.println("   0 - Sair          |");
				System.out.println("  =========================\n");
				opcao = entrada.nextInt();
				
				System.out.print("\n");
				
				switch (opcao) {
				case 1:
					Scanner entrada01 = new Scanner (System.in);
					System.out.println ("Digite nome: ");
					String Nome = entrada01.next();
					ps.setNome(Nome);
					System.out.println(ps.getNome());			

					break;
				case 2:
					Scanner entrada02 = new Scanner (System.in);
					System.out.println ("Digite Sexo: ");
					String Sexo = entrada02.next();
					ps.setSexo(Sexo);
					System.out.println(ps.getSexo());			

					break;
				case 3:
					Scanner entrada03 = new Scanner (System.in);
					System.out.println ("Digite idade: ");
					int idade = entrada03.nextInt();
					ps.setidade(idade);
					System.out.println(ps.getidade());			
					
					break;
				case 0:
					break;
				default:
					System.out.println("Opção Inválida!");
					break;
				}
				
			}
			while (opcao != 0);
			entrada.close();
		}
}


