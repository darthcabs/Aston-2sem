package br.com.fiap.beans;

import java.util.Calendar;

public class Hora {
	double valor;
	Calendar data;
	
	public Hora(){}

	public Hora(double valor, Calendar data) {
		this.valor = valor;
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

}
