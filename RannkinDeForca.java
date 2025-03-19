package aula09;

import java.util.Scanner;

public class RannkinDeForca {
 public static void main(String[] args) {
	 // DEFININDO VARIAVEL
	Double valor;
	String nickName;
	
	// SCANNER
	Scanner ler= new Scanner(System.in);
	
	//ENTRADA DE DADOS 
	System.out.println("Qual será seu nome?  ");
	nickName = ler.nextLine();
	
	
	
	System.out.println("Qual é sua pontuação?  ");
	valor= ler.nextDouble();
	
	ler.close();
	
	//PROCESSAMENTO
	if (valor >= 1 && valor <= 20) {
		System.out.println(nickName + ":" + valor );
		System.out.println( "Você é um iniciante em potencial");	
	}
	if (valor >= 21 && valor <= 50) {
		System.out.println(nickName + ":" + valor);
		System.out.println("Você é um incrivel guerreiro");
		
	}
	if (valor >= 51 && valor <= 80) {
		System.out.println(nickName + ":" + valor);	
		System.out.println(" Parabéns você esta na elite");
	}
	if (valor >= 81 && valor <= 100) {
		System.out.println(nickName +":" + valor);
	    System.out.println("Parabéns você atingio o nivel maximo : lendario");
	}
	else {
		System.out.println("Não vale hack, seja sincero>.<");
	}
}
}
