package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args)
	{
		/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias 
		 * e mostre-a expressa apenas em dias. */
		
		Scanner ler = new Scanner(System.in);
		
		int anos,meses,dias,idias; //idias representa idade em dias
		
		System.out.println("Quantos anos você tem?");
		anos = ler.nextInt();
		System.out.println("Quantos meses?");
		meses = ler.nextInt();
		System.out.println("Quantos dias?");
		dias = ler.nextInt();
		
		idias = (anos*365) + (meses*30)  + dias;
		System.out.println("Sua idade em dias é: " + idias);
	}

}
