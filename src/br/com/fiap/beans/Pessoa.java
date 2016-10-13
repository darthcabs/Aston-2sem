package br.com.fiap.beans;

public class Pessoa {
	String nome;
	Telefone[] telefone;
	Endereco[] endereco;
	
	public Pessoa(){

	}

	public Pessoa(String nome, Telefone telefone[], Endereco endereco[]){
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Telefone[] getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}

	public Endereco[] getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco[] endereco) {
		this.endereco = endereco;
	}

}