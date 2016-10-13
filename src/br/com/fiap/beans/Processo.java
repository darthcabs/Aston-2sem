package br.com.fiap.beans;

import java.util.Calendar;

public class Processo {
	Cliente cliente;
	Especialidade especialidade;
	Honorario[] honorario;
	Forum forum;
	Despesa[] despesa;
	String descricao;
	Calendar dataAbertura;
	Calendar dataFechamento;
	Calendar dataVencimento;
	int resultado;
	int situacao;
	String observacao;
	Taxa taxa;
	
	/**
	 * 
	 */
	public Processo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cliente
	 * @param especialidade
	 * @param honorario
	 * @param forum
	 * @param despesa
	 * @param descricao
	 * @param dataAbertura
	 * @param dataFechamento
	 * @param dataVencimento
	 * @param resultado
	 * @param situacao
	 * @param observacao
	 */
	public Processo(Cliente cliente, Especialidade especialidade, Honorario[] honorario, Forum forum, Despesa[] despesa,
			String descricao, Calendar dataAbertura, Calendar dataFechamento, Calendar dataVencimento, int resultado,
			int situacao, String observacao, Taxa taxa) {
		this.cliente = cliente;
		this.especialidade = especialidade;
		this.honorario = honorario;
		this.forum = forum;
		this.despesa = despesa;
		this.descricao = descricao;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
		this.dataVencimento = dataVencimento;
		this.resultado = resultado;
		this.situacao = situacao;
		this.observacao = observacao;
		this.taxa = taxa;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the especialidade
	 */
	public Especialidade getEspecialidade() {
		return especialidade;
	}

	/**
	 * @param especialidade the especialidade to set
	 */
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	/**
	 * @return the honorario
	 */
	public Honorario[] getHonorario() {
		return honorario;
	}

	/**
	 * @param honorario the honorario to set
	 */
	public void setHonorario(Honorario[] honorario) {
		this.honorario = honorario;
	}

	/**
	 * @return the forum
	 */
	public Forum getForum() {
		return forum;
	}

	/**
	 * @param forum the forum to set
	 */
	public void setForum(Forum forum) {
		this.forum = forum;
	}

	/**
	 * @return the despesa
	 */
	public Despesa[] getDespesa() {
		return despesa;
	}

	/**
	 * @param despesa the despesa to set
	 */
	public void setDespesa(Despesa[] despesa) {
		this.despesa = despesa;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the dataAbertura
	 */
	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * @param dataAbertura the dataAbertura to set
	 */
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	/**
	 * @return the dataFechamento
	 */
	public Calendar getDataFechamento() {
		return dataFechamento;
	}

	/**
	 * @param dataFechamento the dataFechamento to set
	 */
	public void setDataFechamento(Calendar dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	/**
	 * @return the dataVencimento
	 */
	public Calendar getDataVencimento() {
		return dataVencimento;
	}

	/**
	 * @param dataVencimento the dataVencimento to set
	 */
	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	/**
	 * @return the resultado
	 */
	public int getResultado() {
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	/**
	 * @return the situacao
	 */
	public int getSituacao() {
		return situacao;
	}

	/**
	 * @param situacao the situacao to set
	 */
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	/**
	 * @return the observacao
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * @param observacao the observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	/**
	 * @return the taxa
	 */
	public Taxa getTaxa() {
		return taxa;
	}

	/**
	 * @param taxa the taxa to set
	 */
	public void setTaxa(Taxa taxa) {
		this.taxa = taxa;
	}
	
	
	
	
}