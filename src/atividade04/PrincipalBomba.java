package atividade04;

import java.util.Scanner;

public class PrincipalBomba {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		BombaDagua bomba = new BombaDagua();
		
		System.out.println("Digite a quantidade de segundos em que a bomba sera ligada: ");
		bomba.ligar(entrada.nextInt());
		entrada.close();
	}

}
