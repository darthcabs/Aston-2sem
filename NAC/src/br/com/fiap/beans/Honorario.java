package br.com.fiap.beans;

public class Honorario {
	long codigo;
	String data;
	double duracao;
	String observacao;
	String tarefa;
	Advogado advogado;

	public Honorario() {
	
	}
	
	public Honorario(long codigo, String data, double duracao, String observacao, String tarefa, Advogado advogado) {
		this.codigo = codigo;
		this.data = data;
		this.duracao = duracao;
		this.observacao = observacao;
		this.tarefa = tarefa;
		this.advogado = advogado;
	}
	
	public Advogado getAdvogado() {
		return advogado;
	}

	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}

	
	public long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public double getDuracao() {
		return duracao;
	}
	
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getTarefa() {
		return tarefa;
	}
	
	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
}