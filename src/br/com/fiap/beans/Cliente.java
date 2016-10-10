package br.com.fiap.beans;

public class Cliente extends Pessoa{
	String razaoSocial;
	String cnpj;
	String inscricaoEstadural;
	String email;
	String password;
	
	
	public Cliente() {}


	public Cliente(String nome, String razaoSocial, String cnpj, String inscricaoEstadural, String email, String password) {
		super(nome);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscricaoEstadural = inscricaoEstadural;
		this.email = email;
		this.password = password;
	}
	
	

	
}