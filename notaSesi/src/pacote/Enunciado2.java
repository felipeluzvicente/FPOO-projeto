package pacote;
import java.util.Scanner;
public class Enunciado2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String codigo;
		double valor = 0, quantidade, total = 0;
		
		System.out.println("digite um dos c�digos");
		codigo = scanner.next();
		
		switch(codigo) {
		case "A001":
			
			System.out.println("quantos produtos voc� deseja comprar");
			quantidade = scanner.nextDouble();
			
			total = quantidade * 7.50;
			
			break;
			
		case "A002":
			
					System.out.println("quantos produto voc� deseja comprar");
					quantidade = scanner.nextDouble();
					
					total = quantidade * 9.90;
					
					break;
					
		case "A003":

					System.out.println("quantos produto voc� deseja comprar");
					quantidade = scanner.nextDouble();
					
					total = quantidade * 14.00;
					
					break;
					
		case "A004":
		
					System.out.println("quantos produto voc� deseja comprar");
					quantidade = scanner.nextDouble();
					
					total = quantidade * 19.99;
					
					break;
					
					default:
					
						System.out.println("Plano Inv�lido");
						break;
		}
		
		System.out.println("o valor total � " + total);
		
		}
	
}
