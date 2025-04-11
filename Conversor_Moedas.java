package Aula12032025;

import java.util.Scanner;

public class Conversor_Moedas {
public static void main(String[] args) {
	//DECLARANDO VARIAVEIS
	double valorReal;
	double cotacaoMoeda;
	double valorConvertido;
	
	//ENTRADA DE DADOS
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite o valor em reais:");
	valorReal = ler.nextDouble();
	
	System.out.println("Digite a cotação da moeda desejada:");
	cotacaoMoeda = ler.nextDouble();
	
	//PROCESSAMENTO
	valorConvertido = valorReal * cotacaoMoeda;
	
	//SAÍDA
	System.out.println("O valor convertido para a moeda desejada é:" + valorConvertido);
	
	ler.close();
}
}
