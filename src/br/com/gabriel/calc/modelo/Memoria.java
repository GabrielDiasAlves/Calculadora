package br.com.gabriel.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

	private String textoAtual = "";
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	private static final Memoria instancia = new Memoria();

	private Memoria() {
	}

	public static Memoria getInstancia() {
		return instancia;
	}

	public void adicionarObervador(MemoriaObservador observador) {
		observadores.add(observador);
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}

	public void processarComando(String valor) {
		if ("AC".equals(valor)) {
			textoAtual = "";
		} else {
			textoAtual += valor;
		}
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}
}
