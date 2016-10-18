package br.com.fiap.beans;


public class Hora {
	double valor;
	String data;
	
	public Hora(){}

	public Hora(double valor, String data) {
		this.valor = valor;
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
