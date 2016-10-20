package br.com.fiap.beans;

import java.util.List;

public class Pessoa {
	protected long codigo;
	protected String nome;
	protected List<Telefone> telefones;
	protected List<Endereco> enderecos;
	
	public Pessoa(){

	}
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	public Pessoa(long codigo, List<Telefone> telefone, List<Endereco> endereco) {
		this.codigo = codigo;
		this.telefones = telefone;
		this.enderecos = endereco;
	}
	
	public Pessoa(long codigo, String nome, List<Telefone> telefone, List<Endereco> endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefones = telefone;
		this.enderecos = endereco;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefone) {
		this.telefones = telefone;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> endereco) {
		this.enderecos = endereco;
	}
}