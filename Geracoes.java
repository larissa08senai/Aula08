package aula09;

import java.util.Scanner;

public class Geracoes {
 public static void main(String[] args) {
	 //DEFININDO VARIAVEL
	Double valor;
	
	//SCANNER
	Scanner ler= new Scanner(System.in);
	
	//ENTRADA DE DADOS 
	System.out.println("Qual é o ano que você nasceu? (escreva todos os digitos do ano)  ");
	valor= ler.nextDouble();
	
	ler.close();
	
	//PROCESSAMENTO
	if (valor >= 1946 && valor <= 1964) {
		System.out.println("Você é Baby boomer");
	}
    if (valor >= 1965 && valor <= 1980 ) {
		System.out.println("Você é Geração X");
	}
	if (valor >= 1981 && valor <= 1996) {
		System.out.println("Você é Millennion/Geração Y");
	}
	if (valor >= 1997 && valor <=2010) {
		System.out.println(" Você é Geração Z");
	}
	if (valor >= 2010) {
		System.out.println("Você é Geração Alpha");
	}
	if (valor > 2025) {
		System.out.println("Você nem nasceu cara");
		
	}
}
}
