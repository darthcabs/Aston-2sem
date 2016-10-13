package br.com.fiap.beans;

public class Telefone {
	String ddd;
	String numero;
	String tipo;
	String ramal;
	
	public Telefone(){}

	public Telefone(String ddd, String numero, String tipo, String ramal) {
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
		this.ramal = ramal;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	
}