package br.com.fiap.beans;

import java.util.List;

public class Processo {
	long numero;
	Cliente cliente;
	Causa especialidade;
	Advogado advogado;
	List<Honorario> honorario;
	Forum forum;
	List<Despesa> despesa;
	String descricao;
	String dataAbertura;
	String dataFechamento;
	String dataVencimento;
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
	 * @param numero
	 * @param cliente
	 * @param especialidade
	 * @param advogado
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
	 * @param taxa
	 */
	public Processo(long numero, Cliente cliente, Causa especialidade, Advogado advogado, List<Honorario> honorario,
			Forum forum, List<Despesa> despesa, String descricao, String dataAbertura, String dataFechamento,
			String dataVencimento, int resultado, int situacao, String observacao, Taxa taxa) {
		this.numero = numero;
		this.cliente = cliente;
		this.especialidade = especialidade;
		this.advogado = advogado;
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

	public Processo(long numero, String descricao, Forum forum){
		this.numero = numero;
		this.descricao = descricao;
		this.forum = forum;
	}
	
	/**
	 * @return the numero
	 */
	public long getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(long numero) {
		this.numero = numero;
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
	public Causa getEspecialidade() {
		return especialidade;
	}

	/**
	 * @param especialidade the especialidade to set
	 */
	public void setEspecialidade(Causa especialidade) {
		this.especialidade = especialidade;
	}

	/**
	 * @return the advogado
	 */
	public Advogado getAdvogado() {
		return advogado;
	}

	/**
	 * @param advogado the advogado to set
	 */
	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}

	/**
	 * @return the honorario
	 */
	public List<Honorario> getHonorario() {
		return honorario;
	}

	/**
	 * @param honorario the honorario to set
	 */
	public void setHonorario(List<Honorario> honorario) {
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
	public List<Despesa> getDespesa() {
		return despesa;
	}

	/**
	 * @param despesa the despesa to set
	 */
	public void setDespesa(List<Despesa> despesa) {
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
	public String getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * @param dataAbertura the dataAbertura to set
	 */
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	/**
	 * @return the dataFechamento
	 */
	public String getDataFechamento() {
		return dataFechamento;
	}

	/**
	 * @param dataFechamento the dataFechamento to set
	 */
	public void setDataFechamento(String dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	/**
	 * @return the dataVencimento
	 */
	public String getDataVencimento() {
		return dataVencimento;
	}

	/**
	 * @param dataVencimento the dataVencimento to set
	 */
	public void setDataVencimento(String dataVencimento) {
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