package br.com.fiap.beans;

public class Despesa {
	long codigo;
	String tipo;
	String data;
	double valor;
	String observacao;
	
	public Despesa() {
	
	}

	public Despesa(long codigo, String tipo, String data, double valor, String observacao) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.data = data;
		this.valor = valor;
		this.observacao = observacao;
	}

	public long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
