package atividade01;

import java.util.Scanner;

//import javax.print.attribute.standard.Media;

public class PrincipalAluno {
	public static void main(String[] args) {
		aluno al1 = new aluno();
	
			Scanner entrada = new Scanner (System.in);
			System.out.println ("Digite nome do Aluno:");
			String aluno = entrada.nextLine();
		
			System.out.println ("Digite a primeira nota: ");
			double Nota1 = entrada.nextInt();
			
			System.out.println ("Digite a segunda nota: ");
			double Nota2 = entrada.nextInt();
			
			System.out.println ("Digite a terceira nota: ");
			double Nota3 = entrada.nextInt();
			
			System.out.println ("Digite a quarta nota: ");
			double Nota4 = entrada.nextInt();
			
			al1.setaluno(aluno);
			al1.setNota1(Nota1);
			al1.setNota2(Nota2);
			al1.setNota3(Nota3);
			al1.setNota4(Nota4);
			al1.setMedia(Nota1, Nota2, Nota3, Nota4);
	
			System.out.println(al1.getaluno(aluno));
			System.out.println(al1.getMedia());
			entrada.close();
	}
}
