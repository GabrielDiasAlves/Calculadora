package br.com.gabriel.calc.visao;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {
		setSize(232, 322);						 //Define o tamanho da tela
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Finaliza o processo/janela automaticamente 
		setLocationRelativeTo(null);			 //Faz com que inicialize no centro da tela do computador
		setVisible(true); 						 //Habilita a tela 
	}
	
	public static void main(String[] args) {
		new Calculadora();
	}
	
}
