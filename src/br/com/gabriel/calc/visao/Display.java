package br.com.gabriel.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel {

	private final JLabel label;
	
	public Display() {
		label = new JLabel("123");
		setBackground(new Color(46, 49, 50)); 				 //Definindo cor do fundo
		label.setForeground(Color.WHITE); 					 //Definindo cor do texto
		label.setFont(new Font("courier", Font.PLAIN, 30));  //Definindo a fonte
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20)); //Definindo o local de exibição
		add(label); 										 //Adicionando na tela
	}
	
}
