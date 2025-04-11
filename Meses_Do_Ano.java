package Aula19032025;

import java.util.Scanner;

public class Meses_Do_Ano {
public static void main(String[] args) {
	int num;
	Scanner numero = new Scanner (System.in);
	System.out.println("Informe um número");
	num = numero .nextInt();
	numero.close();
	if (num ==1) {
		System.out.println("Janeiro");
		
	} else if (num ==2) {
		System.out.println("Fevereiro");
	}else if (num ==3) {
		System.out.println("Março");
	}else if (num ==4) {
		System.out.println("Abril");
	}else if (num ==5) {
		System.out.println("Maio");
	}else if (num ==6) {
		System.out.println("Junho");
	}else if (num ==7) {
		System.out.println("Julho");
	}else if (num ==8) {
		System.out.println("Agosto");
	}else if (num ==9) {
		System.out.println("Setembro");
	}else if (num ==10) {
		System.out.println("Outubro");
	}else if (num ==11) {
		System.out.println("Novembro");
	}else if (num ==12) {
		System.out.println("Dezembro");
	}else if (num >12) {
		System.out.println("Mêsnválido");
	}
}
}
