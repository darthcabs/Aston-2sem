package br.com.fiap.beans;

public class Forum extends Pessoa{
	String descricao;
	
	public Forum(){}
	
	public Forum(String nome, Telefone[] telefone, Endereco[] endereco, String descricao){
		super(nome, telefone, endereco);
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
