package br.com.fiap.beans;

import java.util.List;

public class Advogado extends Pessoa {
	String oab;
	String cpf;
	String rg;
	String email;
	String password;
	List<Hora> horas;
	List<Causa> causas;

	public Advogado(long codigo,String nome){
		super(codigo,nome);
	}
	
	public Advogado() {

	}

	/**
	 * @param oab
	 * @param cpf
	 * @param rg
	 * @param email
	 * @param password
	 * @param horas
	 * @param causas
	 */
	public Advogado(String oab, String cpf, String rg, String email, String password, List<Hora> horas,
			List<Causa> causas) {
		this.oab = oab;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
		this.password = password;
		this.horas = horas;
		this.causas = causas;
	}

	/**
	 * @return the oab
	 */
	public String getOab() {
		return oab;
	}

	/**
	 * @param oab the oab to set
	 */
	public void setOab(String oab) {
		this.oab = oab;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the horas
	 */
	public List<Hora> getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(List<Hora> horas) {
		this.horas = horas;
	}

	/**
	 * @return the causas
	 */
	public List<Causa> getCausas() {
		return causas;
	}

	/**
	 * @param causas the causas to set
	 */
	public void setCausas(List<Causa> causas) {
		this.causas = causas;
	}

	
}