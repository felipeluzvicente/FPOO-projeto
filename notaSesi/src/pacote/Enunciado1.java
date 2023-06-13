package pacote;
import java.util.Scanner;
public class Enunciado1 {

	public static void main(String[] args) {
		
		String plano; 
		
		Scanner objScanner = new Scanner(System.in);
		
		System.out.println("insira o nome do seu plano");
		plano= objScanner.next();
		
		if(plano.equalsIgnoreCase("basico")) {
			System.out.println("o valor do seu plano corresponde a R$ 150,00");
			
		}else if(plano.equalsIgnoreCase("bronze")){
			System.out.println("o valor do seu plano corresponde a R$ 220,00");	
			
		}else if(plano.equalsIgnoreCase("prata")){
			System.out.println("o valor do seu plano corresponde a R$ 310,00");
				
		}else if(plano.equalsIgnoreCase("ouro")){
			System.out.println("o valor do seu plano corresponde a R$ 450,00");
					
		}else {
			System.out.println("Informação Errada");
		}
			
	}
	}
