package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args)
	{
		/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos 
		 * e mostre-o expresso em horas, minutos e segundos.*/
		
		Scanner ler = new Scanner(System.in);
		
		int horas,minutos,segundos,tsegundos; //tsegundos representa total de segundos
		
		System.out.println("Qunatos segundos quer calcular?");
		tsegundos =ler.nextInt();
		horas = tsegundos/3600;
		minutos = (tsegundos - (3600*horas)) /60;
		segundos = (tsegundos - (3600*horas)) %60;
		
		System.out.println("O tempo de dura��o do evento na fabrica foi de " + horas  + " horas, " + minutos + " minutos e " + segundos + " segundos");
	}

}
