import java.util.Scanner;

public class CreditCardApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int entry;
		double value;
		
		CreditCard creditCard = new CreditCard("027484375", "Rogério Fidencio", 2028, 06);
		
		do {
			System.out.println("para adicionar limite ao cartão digite 1 / para fazer uma compra digite 2 / para sair digite 3.");
			System.out.println();
			
			entry = input.nextInt();
			
			if (entry == 1) {
				System.out.println("Digite o valor que deseja adicionar ao limite:  ");
				
				value = input.nextDouble();
				
				creditCard.addBalance(value);
				System.out.printf("Limite adicionado no valor de: %.2f R$\n", value);
			}
			
			if (entry == 2) {
				System.out.println("Digite o valor da compra: ");
				
				value = input.nextDouble();
				
				if (creditCard.buy(value)) {
					System.out.printf("Compra no valor de %.2f R$ efetuada com sucesso!\n", value);
				}
				else {
					System.out.println("Compra recusada!");					
				}
								
			}
			
		} while (entry != 3);
		
		input.close();
	}
}
