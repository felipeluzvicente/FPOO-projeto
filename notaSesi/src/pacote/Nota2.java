package pacote;

public class Nota2 {

	public static void main(String[] args) {
		
		int nota1 = 2;
		
		int nota2 = 2;
		
		int nota3 = 2;
		
		int nota4 = 2;
		
		int media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println(media);
				
		if (media > 7) {
			System.out.println("aluno aprovado");
			
		}
		else if (media >= 5 && media <= 7) {
			System.out.println("recuperação");
			
		}
		else {
			System.out.println("reprovado");
		}
	}

}
