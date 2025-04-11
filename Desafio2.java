package Aula12032025;

import java.util.Scanner;

public class Desafio2 {
private static double radiano;

public static void main(String[] args) {
	//DECLARAÇÃO DE VARIÁVEIS
	double ÂnguloDeLançamento, VelocidadeInicial, DistânciaPercorrida;
	setRadiano(0);
	
	//ENTRADA DE DADOS
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe o valor do ângulo (°):");
	ÂnguloDeLançamento = ler .nextDouble();
	
	System.out.println("Informe a velocidade inicial (km/h");
	VelocidadeInicial = ler .nextDouble();
	
	//PROCESSAMENTO
	setRadiano(Math.toRadians(ÂnguloDeLançamento));
	DistânciaPercorrida = (((VelocidadeInicial *VelocidadeInicial)*Math.sin(ÂnguloDeLançamento))/9.81);
	
	//SAÍDA
	System.out.println("A distância percorrida é:"+DistânciaPercorrida);
 	ler.close();
}

public static double getRadiano() {
	return radiano;
}

public static void setRadiano(double radiano) {
	Desafio2.radiano = radiano;
}
} 
