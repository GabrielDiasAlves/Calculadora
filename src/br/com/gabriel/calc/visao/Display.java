package br.com.gabriel.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import br.com.gabriel.calc.modelo.Memoria;
import br.com.gabriel.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

	private final JLabel label;

	public Display() {
		Memoria.getInstancia().adicionarObervador(this);
		
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		setBackground(new Color(46, 49, 50)); // Definindo cor do fundo
		label.setForeground(Color.WHITE); // Definindo cor do texto
		label.setFont(new Font("courier", Font.PLAIN, 30)); // Definindo a fonte
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20)); // Definindo o local de exibição
		add(label); // Adicionando na tela
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}

}
