package Aula19032025;

import java.util.Scanner;

public class Personagem {
public static void main(String[] args) {
	Double Forca;
	String nome;

	Scanner ler = new Scanner (System.in);
	System.out.println("Informe o nome do seu personagem");
	nome = ler.next();
	
	System.out.println("Informe a força : ");
	Forca = ler.nextDouble();
	
	if (Forca <= 100) {
		System.out.println(nome +" Lendário");
	}
	else if (Forca <= 81) {
		System.out.println(nome +" Elite");
	}
	else if (Forca <= 51) {
		System.out.println( nome +" Guerreiro");
	}
	else if (Forca <= 21) {
		System.out.println(nome +" Iniciante");
	}
	else {
		System.out.println(nome + " Erro");
	}
	ler.close();
}
}
