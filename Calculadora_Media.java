package Aula12032025;

import java.util.Scanner;

public class Calculadora_Media {
	public static void main(String[] args) {
		// DECLARANDO VARIAVEIS
		double nota1, nota2, nota3, nota4, media;
		
		// CHAMAR O SCANNER
Scanner ler = new Scanner(System.in);
System.out.println("Informe a nota 1:");
nota1 = ler.nextDouble();
System.out.println("Informa a nota 2:");
nota2 = ler.nextDouble();
System.out.println("Informe a nota 3:");
nota3 = ler.nextDouble();
System.out.println("Informe a nota 4:");
nota4 = ler.nextDouble();
ler.close();
       // PROCESSAMENTO
media = (nota1 + nota2 + nota3 + nota4)/4;
 // SAÍDA
System.out.println("A média das notas é:" + media);
	}
}
