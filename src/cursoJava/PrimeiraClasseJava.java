package cursoJava;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

	String nota1 =	JOptionPane.showInputDialog("Por favor digite a nota1: ");
	String nota2 =	JOptionPane.showInputDialog("Por favor digite a nota2: ");
	String nota3 =	JOptionPane.showInputDialog("Por favor digite a nota3: ");
	String nota4 =	JOptionPane.showInputDialog("Por favor digite a nota4: ");
	
	double dNota1 = Double.parseDouble(nota1);
	double dNota2 = Double.parseDouble(nota2);
	double dNota3 = Double.parseDouble(nota3);
	double dNota4 = Double.parseDouble(nota4);
	
	double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
	
	if (media >= 50) {
		if (media >= 70) {
			JOptionPane.showMessageDialog(null, "Aluno aprovado com media de: "+media);
		}else {
			JOptionPane.showMessageDialog(null, "Aluno em recuperação com media de: "+media);
		}
	}else {
		JOptionPane.showMessageDialog(null, "Aluno reprovado com média de: "+media);
	}
			
	}

}
