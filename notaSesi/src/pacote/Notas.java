package pacote;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota1 = 12;
		
		int nota2 = 14;
		
		int nota3 = 13;
		
		if (nota1 > nota2 && nota1 > nota3) { 
			
			System.out.println(nota1 + "Nota 1 � o maior n�mero!");
			 
		} else if (nota2 > nota3 && nota2 > nota1) {
			
			System.out.println(nota2 + "Nota 2 � o maior n�mero");
			
		}else {
			
			System.out.println(nota3 + "Nota 3 � o maior numero!");
		}
	}

}
