package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args)
	{
		/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor 
		 * e dos impostos (aplicados ao custo de f�brica). 
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. */

		Scanner ler = new Scanner(System.in);
		
		float cfab,pdist,imp,ccons;
		//cfab representa o custo de f�brica, pdist representa percentagem do distribuidor, imp representa impostos ccons representa o custo do consumidor
		
		System.out.println("Entre com o custo de f�brica do carro: ");
		cfab = ler.nextFloat();
		
		pdist = (cfab*28) /100;
		imp = (cfab*45) /100;
		
		ccons = cfab + pdist + imp;
		
		System.out.println("O custo do consumidor � de: " + ccons + " dinheiros");
	}

}
