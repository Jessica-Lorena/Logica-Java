package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args)
	{
		/*Um sistema de equações lineares do tipo: 
		 * ax + by = c
		 * dx + ey = f
		 * pode ser resolvido segundo mostrado abaixo : 
		 x = (ce - bf) / (ae - bd)
		 y = (af - cd) / (ae - bd) 
		 Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. */
		
		Scanner ler = new Scanner(System.in);
		
		float A,B,C,D,E,F,X,Y;
		
		System.out.println("Entre com o valor de A:");
		A = ler.nextFloat();
		System.out.println("Entre com o valor de B:");
		B = ler.nextFloat();
		System.out.println("Entre com o valor de C:");
		C = ler.nextFloat();
		System.out.println("Entre com o valor de D:");
		D = ler.nextFloat();
		System.out.println("Entre com o valor de E:");
		E = ler.nextFloat();
		System.out.println("Entre com o valor de F:");
		F = ler.nextFloat();
		
		X = (C*E - B*F) / (A*E - B*D);
		Y = (A*F - C*D) / (A*E - B*D);
		
		System.out.println("Para os valores colocados temos: \nx= " + X + "\ny= " + Y);
	}

}
