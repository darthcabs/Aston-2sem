package br.com.fiap.beans;

public class Cliente extends Pessoa{
	String razaoSocial;
	String cnpj;
	String inscricaoEstadural;
	String email;
	String password;

	public Cliente() {
	
	}

	public Cliente(String nome, Telefone telefone[], Endereco endereco[], String razaoSocial, String cnpj,
			String inscricaoEstadural, String email, String password) {
		super(nome, telefone, endereco);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscricaoEstadural = inscricaoEstadural;
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

	public String getInscricaoEstadural() {
		return inscricaoEstadural;
	}

	public void setInscricaoEstadural(String inscricaoEstadural) {
		this.inscricaoEstadural = inscricaoEstadural;
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