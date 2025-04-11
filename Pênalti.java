package Aula19032025;

import java.util.Random;
import java.util.Scanner;

public class Pênalti {
public static void main(String[] args) {
	double direcao;
	int goleiro;
	
	//ENTRADA
	Scanner ler = new Scanner(System.in);
	System.out.println("Escolha uma direção para chutar: ");
	direcao = ler.nextDouble();
	ler.close();
	
	//PROCESSAMENTO
	if (direcao <=0 || direcao >=4 ) {
	System.out.println("Chutou para fora");
	}else {
	Random randon = new Random ();
	goleiro = randon.nextInt(3)+1;
	
	//SAIDA
	System.out.println("Goleiro pulou para " + goleiro);
	if (goleiro == direcao) {
	System.out.println("O goleiro defendeu!");
	}
	else {
	System.out.println("Você fez o gol!");
	}
}
}
}