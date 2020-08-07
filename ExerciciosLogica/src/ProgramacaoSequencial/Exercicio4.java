package ProgramacaoSequencial;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio4 {
	public static void main(String[] args)
	{
		/*Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
		 * e calcule a seguinte expressão: D = (R+S)/2 
		 * Onde R = (A + B)² e S = (B + C)² */
		
		Scanner ler = new Scanner(System.in);
		
		int A,B,C;
		double AB,D,R,S;
		
		System.out.println("Entre com o valor de A: ");
		A = ler.nextInt();
		System.out.println("Entre com o valor de B: ");
		B = ler.nextInt();
		System.out.println("Entre com o valor de C: ");
		C = ler.nextInt();
		
		R = Math.pow((A + B), 2);
		S = Math.pow((B + C), 2);
		D = (R +S) /2;
		
		System.out.println("O resultado é: " + D);
	}

}
