 import java.util.Scanner;
     public class Enunciado3 {
    	
    	 public static void main(String[] args) {
    	
    		 Scanner scanner = new Scanner(System.in);
    		 double tempo, velocidade, distancia, litrosGastos;
    		 
    		 System.out.println("BEM-VINDO");
    		 
    		 System.out.println("INFORME O TEMPO GASTO");
    		 tempo = scanner.nextDouble();
    		 
    		 System.out.println("INFORME A VELOCIDADE M�DIA");
    		 velocidade = scanner.nextDouble();
    		 distancia = (tempo*velocidade);
    		 litrosGastos = distancia/12;
    		 
    		 System.out.println("RESULTADO DO TEMPO GASTO     " + tempo);
    		 
    		 System.out.println("VELOCIDADE M�DIA         " + velocidade);
    		 
    		 System.out.println("DIST�NACIA PERCORRIDA     " + distancia);
    		 
    		 System.out.println("LITROS GASTOS     " + litrosGastos);

    		 
    	 }

		
		}
	


