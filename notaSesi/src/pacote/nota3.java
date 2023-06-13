package pacote;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;

public class nota3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1;
	
		double nota2;
		
		double nota3;
		
		double nota4;
		
		double media;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("informe a primeira nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("informe a segunda nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("informe a terceira nota"));
		nota4 = Double.parseDouble(JOptionPane.showInputDialog("informe a quarta nota"));
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media > 7) {
			
			System.out.println("aluno aprovado");
			
		}else if(media >= 5 && media >= 7) {
			
			System.out.println("aluno de recuperação");
			
		}
		else {
			
			System.out.println("aluno reprovado");
		}
		
	}

}
