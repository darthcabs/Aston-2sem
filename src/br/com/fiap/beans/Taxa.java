package br.com.fiap.beans;

import java.util.Calendar;

public class Taxa {
	Calendar dataVigencia;
	double administrativa;
	double juros;
	double diaria;
	/**
	 * 
	 */
	public Taxa() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param dataVigencia
	 * @param administrativa
	 * @param juros
	 * @param diaria
	 */
	public Taxa(Calendar dataVigencia, double administrativa, double juros, double diaria) {
		this.dataVigencia = dataVigencia;
		this.administrativa = administrativa;
		this.juros = juros;
		this.diaria = diaria;
	}
	/**
	 * @return the dataVigencia
	 */
	public Calendar getDataVigencia() {
		return dataVigencia;
	}
	/**
	 * @param dataVigencia the dataVigencia to set
	 */
	public void setDataVigencia(Calendar dataVigencia) {
		this.dataVigencia = dataVigencia;
	}
	/**
	 * @return the administrativa
	 */
	public double getAdministrativa() {
		return administrativa;
	}
	/**
	 * @param administrativa the administrativa to set
	 */
	public void setAdministrativa(double administrativa) {
		this.administrativa = administrativa;
	}
	/**
	 * @return the juros
	 */
	public double getJuros() {
		return juros;
	}
	/**
	 * @param juros the juros to set
	 */
	public void setJuros(double juros) {
		this.juros = juros;
	}
	/**
	 * @return the diaria
	 */
	public double getDiaria() {
		return diaria;
	}
	/**
	 * @param diaria the diaria to set
	 */
	public void setDiaria(double diaria) {
		this.diaria = diaria;
	}
	
	

}
