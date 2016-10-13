package br.com.fiap.beans;

import java.util.Calendar;

public class Honorario {
	Calendar data;
	double duracao;
	String observacao;
	String tarefa;
	Advogado advogado;
	
	/**
	 * 
	 */
	public Honorario() {
	}

	/**
	 * @param data
	 * @param duracao
	 * @param observacao
	 * @param tarefa
	 * @param advogado
	 */
	public Honorario(Calendar data, double duracao, String observacao, String tarefa, Advogado advogado) {
		this.data = data;
		this.duracao = duracao;
		this.observacao = observacao;
		this.tarefa = tarefa;
		this.advogado = advogado;
	}

	/**
	 * @return the data
	 */
	public Calendar getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Calendar data) {
		this.data = data;
	}

	/**
	 * @return the duracao
	 */
	public double getDuracao() {
		return duracao;
	}

	/**
	 * @param duracao the duracao to set
	 */
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	/**
	 * @return the observacao
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * @param observacao the observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	/**
	 * @return the tarefa
	 */
	public String getTarefa() {
		return tarefa;
	}

	/**
	 * @param tarefa the tarefa to set
	 */
	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	/**
	 * @return the advogado
	 */
	public Advogado getAdvogado() {
		return advogado;
	}

	/**
	 * @param advogado the advogado to set
	 */
	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}

	
	
}