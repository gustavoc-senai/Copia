package Aula26032025;

import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {
		int num;
		Scanner numero = new Scanner (System.in);
		System.out.println("Informe um número de 1 a 12");
		
		num = numero.nextInt();
		numero.close();
		
		switch(num) {
		case 1:
			System.out.println("O mês escolhido foi Janeiro");
			break;
		case 2:
			System.out.println("O mês escolhido foi Fevereiro");
			break;
		case 3:
			System.out.println("O mês escolhido foi Março");
			break;
		case 4:
			System.out.println("O mês escolhido foi Abril");
			break;
		case 5: 
			System.out.println("O mÊs escolhido foi Maio");
			break;
		case 6:
			System.out.println("O mês escolhido foi Junho");
			break;
		case 7:
			System.out.println("O mês escolhido foi Julho");
			break;
		case 8:
			System.out.println("O mês escolhido foi Agosto");
			break;
		case 9:
			System.out.println("O mês escolhido foi Setembro");
			break;
		case 10:
			System.out.println("O mês escolhido foi Outuburo");
			break;
		case 11:
			System.out.println("O mês escolhido foi Novembro");
			break;
		case 12:
			System.out.println("O mês escolhido foi Dezembro");
			break;
			default:
				System.out.println("O mês escolhido é inválido");
		}
}
}
