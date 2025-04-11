package Aula12032025;

import java.util.Scanner;

public class Desafio {
public static void main(String[] args) {
	//DECLARAÇÃO DE VARIÁVEIS
	double Ângulo, Radiano =0;
	
	
	//ENTRADA DE DADOS
	Scanner ler = new Scanner (System.in);
	System.out.println("Informe o valor do Ângulo (°):");
	Ângulo =ler .nextDouble();
	
	//PROCESSAMENTO
	Math.atan (Radiano);
	Radiano = ((Ângulo *3.14)/180);
	
	//SAÍDA
	System.out.println("A conversão de ângulo para radiano é:" +Radiano);
	ler.close();
	
	
	
}
}
