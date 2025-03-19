package aula09;

import java.util.Scanner;

public class CatalogoDePeso {
  public static void main(String[] args) {
	//DEFININDO VARIAVEIS
	  boleano sexo;
	  double valor;
	  
	  //SCANNER
	  Scanner ler = new Scanner(System.in);
	  
	  System.out.println("qual é seu genero sexual? ");
	  sexo = ler.nextBoolean();
	  
	  if (sexo != "feminino" || sexo != "masculino") {
		System.out.println("Por favor coloque um genero valido na liga");
	}
	  
	  if (sexo == "feminino") {
		  System.out.println("Qual é seu peso? ");
		  valor = ler.nextDouble();
		  
		  ler.close();
		  
		  if (valor <= 52.2) {
			  System.out.println("Você esta no peso palha");
			
		}
          if (valor >= 52.3 && valor <= 56.7) {
        	  System.out.println("Você esta na categoria peso mosca");
		
	    }
          if (valor >= 56.8 && valor <= 61.2) {
			System.out.println("Você esta na categoria peso galo");
		}
          if (valor >= 61.3) {
        	  System.out.println("Você esta na categoria peso pena");
          }
	  
		
	}
	  if (sexo == "masculino") {
		  if (valor <= 56.7) {
			  System.out.println("Você esta na categoria peso mosca");
			  
		}
		  if (valor >= 56.8 && valor <= 61.2) {
			  System.out.println("você esta no peso galo");
			
		}
		  if (valor >= 61.3 && valor <= 65.8) {
			  System.out.println("Você esta no peso pena");
		  }
		  if (valor >= 65.9 && valor <= 70.3 ) {
			System.out.println("Você esta no peso leve");
		}
		  if (valor >= 70.4 && valor <= 77.2) {
			System.out.println("Voce esta no peso meio-medio ");
		}
		  if (valor >= 77.3 && valor <= 83.9 ) {
			System.out.println("Você esta no peso medio");
		}
		  if (valor >= 84 && valor <= 93) {
			  System.out.println("você esta peso meio-pesado");
		  }
		  if (valor >= 93.1 ) {
			System.out.println("Você esta no peso pesado");
		}
	}
}
}
