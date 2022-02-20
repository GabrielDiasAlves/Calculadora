package br.com.gabriel.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {
		
		organizarLayout();
		
		setSize(232, 322); 						 //Define o tamanho da tela
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Finaliza o processo/janela automaticamente 
		setLocationRelativeTo(null); 			 //Faz com que inicialize no centro da tela do computador
		setVisible(true);  					  	 //Habilita a tela 
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());

		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Calculadora();
	}
	
}
