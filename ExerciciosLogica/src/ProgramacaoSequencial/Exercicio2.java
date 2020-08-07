package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args)
	{
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias 
		 * e mostre-a expressa em anos, meses e dias.*/
		
		Scanner ler = new Scanner(System.in);
		
		int anos,meses,dias,idias; //idias representa idade em dias
		
		System.out.println("Quantos dias você tem?");
		idias = ler.nextInt();
		
		anos = idias/365;
		meses = (idias - (365*anos)) /30;
		dias = (idias -  (365*anos)) %30;
		
		System.out.println("Você tem " + anos + " ano(s) " + meses + " mes(es) e " + dias + " dia(s)");	
	}

}
