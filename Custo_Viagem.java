package Aula12032025;

import java.util.Scanner;

public class Custo_Viagem {
public static void main(String[] args) {
	//DECLARAÇÃO DE VARIÁVEIS
	double valLitro, distanciaKM, consumo, totalLitros, totalGastos;
	
	//ENTRADA DE DADOS
	Scanner ler = new Scanner (System.in);
	System.out.println("Informe o valor do Litro de combustível (R$):");
	valLitro = ler.nextDouble();
	
	System.out.println("Informe a distância percorrida (KM):");
	distanciaKM = ler.nextDouble();
	
	System.out.println("Informe o consumo médio (KM/L):");
	consumo = ler.nextDouble();
	
	//PROCESSAMENTO
	totalLitros = distanciaKM/consumo;
	totalGastos = totalLitros*valLitro;
	
	//SAÍDA
	System.out.println("O total de litros consumidos é:" + totalLitros + "Litros");
	
	System.out.println("O total gasto é R$:" + totalGastos);
	
	ler.close();
	
	
	
}
}
