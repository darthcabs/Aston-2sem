package br.com.fiap.beans;

import java.util.List;

public class Advogado extends Pessoa {
	String oab;
	String cpf;
	String rg;
	String email;
	String password;
	Hora[] hora;
	Especialidade[] tipoCausa;

	public Advogado() {

	}

	public Advogado(long codigo, String nome, List<Telefone> telefone, List<Endereco> endereco, String oab, String cpf,
			String rg, String email, String password, Hora[] hora, Especialidade[] tipoCausa) {
		super(codigo, nome, telefone, endereco);
		this.oab = oab;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
		this.password = password;
		this.hora = hora;
		this.tipoCausa = tipoCausa;
	}

	public String getOab() {
		return oab;
	}

	public void setOab(String oab) {
		this.oab = oab;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
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

	public Hora[] getHora() {
		return hora;
	}

	public void setHora(Hora[] hora) {
		this.hora = hora;
	}

	public Especialidade[] getTipoCausa() {
		return tipoCausa;
	}

	public void setTipoCausa(Especialidade[] tipoCausa) {
		this.tipoCausa = tipoCausa;
	}
}