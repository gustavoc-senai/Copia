package Aula26032025;

	import java.util.Scanner;

	public class Mercado {
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // SOLICITA O NÚMERO DE PRODUTOS
	        System.out.print("Quantos produtos você vai comprar? ");
	        int numProdutos = scanner.nextInt();

	        double total = 0;

	        // SOMA OS PREÇOS DOS PRODUTOS
	        for (int i = 1; i <= numProdutos; i++) {
	            System.out.print("Digite o preço do produto " + i + ": R$ ");
	            double precoProduto = scanner.nextDouble();
	            total += precoProduto;
	        }

	        // EXIBE O VALOR TOTAL DOS PRODUTOS
	        System.out.println("Total dos produtos: R$ " + total);

	        // SOLICITA A FORMA DE PAGAMENTO
	        System.out.println("Escolha a forma de pagamento:");
	        System.out.println("1. Pix (10% de desconto)");
	        System.out.println("2. Dinheiro (5% de desconto)");
	        System.out.println("3. Cartão de Crédito (sem desconto)");

	        int pagamento = scanner.nextInt();

	        double desconto = 0;

	        // APLICA O DESCONTO BASEADO NA FORMA DE PAGAMENTO
	        switch (pagamento) {
	            case 1:
	                desconto = 0.10; // 10% DE DESCONTO PARA PIX
	                break;
	            case 2:
	                desconto = 0.05; // 5% DE DESCONTO PARA DINHEIRO
	                break;
	            case 3:
	                desconto = 0.00; // SEM DESCONTO PARA CARTÃO DE CRÉDITO
	                break;
	            default:
	                System.out.println("Opção inválida.");
	                
	        }

	        // CALCULA O TOTAL COM DESCONTO
	        double totalComDesconto = total - (total * desconto);

	        // EXIBE O VALOR TOTAL COM DESCONTO
	        System.out.println("Valor final com desconto: R$ " + totalComDesconto);
	        
	        scanner.close();
	    }
	

	}

