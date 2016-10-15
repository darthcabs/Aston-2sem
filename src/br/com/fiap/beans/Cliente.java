package br.com.fiap.beans;

import java.util.List;

public class Cliente extends Pessoa{
	String razaoSocial;
	String cnpj;
	String inscricaoEstadual;
	String email;
	String password;

	public Cliente() {
	
	}
	
	public Cliente(long codigo, List<Telefone> telefone, List<Endereco> endereco, String razaoSocial, String cnpj,
			String inscricaoEstadual, String email, String password) {
		super(codigo, telefone, endereco);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.email = email;
		this.password = password;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
}