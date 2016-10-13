package br.com.fiap.beans;

import java.util.Calendar;

public class Despesa {
	Calendar data;
	double valor;
	String observacao;
	String tipo;

	/**
	 * 
	 */
	public Despesa() {
	}

	/**
	 * @param data
	 * @param valor
	 * @param observacao
	 * @param tipo
	 */
	public Despesa(Calendar data, double valor, String observacao, String tipo) {
		this.data = data;
		this.valor = valor;
		this.observacao = observacao;
		this.tipo = tipo;
	}

	/**
	 * @return the data
	 */
	public Calendar getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Calendar data) {
		this.data = data;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * @return the observacao
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * @param observacao
	 *            the observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
