package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args)
	{
		/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
		 * Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.*/
		
		Scanner ler = new Scanner(System.in);
		
		double n1,n2,n3,mp; //n representa nota, mp representa m�dia ponderada
		
		System.out.println("Entre com a primeira nota: ");
		n1 = ler.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		n2 = ler.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		n3 = ler.nextFloat();
		
		mp = ((n1*2.3) + (n2*5) + (n3*2.7)) /10;
		
		System.out.println("A m�dia ponderada foi de: " + mp);
	}

}
