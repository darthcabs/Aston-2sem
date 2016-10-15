package br.com.fiap.beans;

import java.util.List;

public class Forum extends Pessoa{
	String descricao;
	
	public Forum(){
		
	}
	
	public Forum(Long codigo, String nome, List<Telefone> telefone, List<Endereco> endereco, String descricao){
		super(codigo, nome, telefone, endereco);
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}