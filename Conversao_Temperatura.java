package Aula12032025;

import java.util.Scanner;

public class Conversao_Temperatura {
public static void main(String[] args) {
	
	//DECLARAÇÃO DE VARIÁVEIS
	double fahrenheit;
	final double CELSIUS;
	
	//ENTRADA DE DADOS
	Scanner ler = new Scanner (System.in);
	System.out.println("Digite a temperatura em Fahrenheit:");
	fahrenheit = ler.nextDouble();
	
	//PROCESSAMENTO
	CELSIUS = (((fahrenheit -32)*5)/9);
	
	//SAÍDA
	System.out.println("A temperatura em Celsius é:" + CELSIUS);
	
	ler.close();
  }
}
