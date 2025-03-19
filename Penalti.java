package aula09;

import java.util.Random;
import java.util.Scanner;

public class Penalti {
  public static void main(String[] args) {
	  //DEFININDO VARIAVEIS
	  double chute;
	  int goleiro ;
	
	//SCANNER
	  Scanner ler= new Scanner(System.in);
	
	//ENTRADA DE DADOS 
	  System.out.println(" Seu chute é entre 1 à 3 escolha sabiamente");
	  chute= ler.nextDouble();
	
	  ler.close();
	
	//PROCESSAMENTO
	  Random random = new Random();
	  goleiro = random.nextInt(3) + 1;
	
	//PREPARO DA SAIDA
	  System.out.println("seu numero foi:" + chute);
	  System.out.println("numero do goleiro foi:" + goleiro);
	
	  if (chute != goleiro) {
		  System.out.println("Gooooolllll");
		
	}
	  else {
		System.out.println("Defesa tenta novamente");
	}
}
}
