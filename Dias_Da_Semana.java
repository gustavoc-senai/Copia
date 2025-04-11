package Aula12032025;

import java.util.Scanner;

public class Dias_Da_Semana {
public static void main(String[] args) {
	int num;
	Scanner numero = new Scanner (System.in);
	System.out.println("Informe um número");
	num = numero.nextInt();
	numero.close();
	if (num ==1) {
		System.out.println("Domingo");
		
	} else if (num ==2) {
		System.out.println("Segunda");
}else if (num ==3) {
	System.out.println("Terça");
}else if (num ==4 ) {
System.out.println("Quarta");
}else if (num ==5 ) {
	System.out.println("Quinta");
}
else if (num ==6) {
System.out.println("Sexta");

}else if (num ==7) {
	System.out.println("Sábado");
}if (num >7) {
System.out.println("Número Inválido");
}
}
}