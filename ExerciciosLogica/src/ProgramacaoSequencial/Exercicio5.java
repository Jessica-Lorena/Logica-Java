package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args)
	{
		/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.*/
		
		Scanner ler = new Scanner(System.in);
		
		double n1,n2,n3,mp; //n representa nota, mp representa média ponderada
		
		System.out.println("Entre com a primeira nota: ");
		n1 = ler.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		n2 = ler.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		n3 = ler.nextFloat();
		
		mp = ((n1*2.3) + (n2*5) + (n3*2.7)) /10;
		
		System.out.println("A média ponderada foi de: " + mp);
	}

}
