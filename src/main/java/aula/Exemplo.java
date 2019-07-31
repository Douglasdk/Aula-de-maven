package aula;

import javax.swing.JOptionPane;		

public class Exemplo {

	public static int somar(int x, int y) {
		return x + y;
	}
	
	public static int subtrair(int x, int y) {
		return x - y;
	}
	
	public static int mutiplicar(int x, int y) {
		return x * y;
	}
	
	public static int dividir(int x, int y) {
		return x / y;
	}
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		
		JOptionPane.showMessageDialog(null, "Total Soma: " + somar(a,b) + "\nTotal Subtração: " + subtrair(a,b) + "\nTotal Mutiplicação " + mutiplicar(a,b) + "\nTotal Divisão " +dividir(a,b) );
	}
}
