package Aula26032025;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		double a;
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe um valor:");
		a = ler.nextDouble();
		
		String mensagem = a % 5==0 ? "O número é multíplo de 5" : "O número não é multíplo de 5";
		System.out.println(mensagem);
		ler.close();
	}
}
