package ProgramacaoSequencial;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
	public static void main(String[] args)
	{
		/*Construa um programa que, tendo como dados de entrada dois pontos quaisquer no plano, 
		 * P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
		 * A fórmula que efetua tal cálculo é: d = √(x2-x1)² + (y2-y1)² */
		
		Scanner ler = new Scanner(System.in);
		
		double d,x2,x1,y2,y1;
		
		System.out.println("Entre com o valor de x1: ");
		x1 = ler.nextDouble();
		System.out.println("Entre com o valor de y1: ");
		y1 = ler.nextDouble();
		System.out.println("Entre com o valor de x2: ");
		x2 = ler.nextDouble();
		System.out.println("Entre com o valor de y2: ");
		y2 = ler.nextDouble();
		
		d = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));
		
		System.out.println("A distância entre os pontos é de: " + d);
	}

}
