package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;
import br.com.fiap.db.ConnectionFactory;

public class ClienteDAO {
	public Connection conn;

	public ClienteDAO() throws Exception {
		conn = new ConnectionFactory().getConnection();
	}

	public int create(Cliente cli) throws Exception {
		/*
		PreparedStatement statement = conn.prepareStatement(
				"INSERT INTO NEGOCMERC.OPERACAO (vl_preco, vl_quantidade, tp_operacao, cd_mercadoria) VALUES (?, ?, ?, ?)");
		statement.setDouble(1, cli.getPreco());
		statement.setInt(2, cli.getQuantidade());
		statement.setString(3, cli.getTipo().toUpperCase());
		statement.setInt(4, cli.getMercadoria().getCodigo());
		int resp = statement.executeUpdate();
		statement.close();
		*/
		return 0;
	}

	public int update(Cliente cli) throws Exception {
		/*
		PreparedStatement statement = conn.prepareStatement(
				"UPDATE NEGOCMERC.OPERACAO SET vl_preco=?, vl_quantidade=?, tp_operacao=?, cd_mercadoria=? WHERE cd_operacao=?");
		statement.setDouble(1, cli.getPreco());
		statement.setInt(2, cli.getQuantidade());
		statement.setString(3, cli.getTipo().toUpperCase());
		statement.setInt(4, cli.getMercadoria().getCodigo());
		statement.setInt(5, cli.getCodigo());
		int resp = statement.executeUpdate();
		statement.close();
		*/
		return 0;
	}

	public List<Cliente> getAll() throws Exception {
		/*
		 * long codigo 					T_AM_ABR_CLIENTE.CD_CLIENTE 
		 * String nome 
		 * Telefone telefone[] 			T_AM_ABR_TELEFONE
		 * Endereco endereco[] 			T_AM_ABR_BAIRRO, T_AM_ABR_CIDADE, T_AM_ABR_ESTADO, T_AM_ABR_LOGRADOURO,
		 * 								T_AM_ABR_PESSOA_ENDE
		 * String razaoSocial			T_AM_ABR_CLIENTE.DS_RAZAO_SOCIAL
		 * String cnpj 					T_AM_ABR_CLIENTE.NR_CNPJ
		 * String inscricaoEstadural	T_AM_ABR_CLIENTE.NR_INSC_ESTADUAL
		 * String email 				T_AM_ABR_CLIENTE.DS_EMAIL
		 * String password 				T_AM_ABR_CLIENTE.DS_PASSWORD
		 */

		List<Cliente> clientes = new ArrayList<Cliente>();
		
		// Recuperar Clientes
		PreparedStatement stmtCli = conn.prepareStatement(
				"select CD_CLIENTE, initcap(DS_RAZAO_SOCIAL) \"DS_RAZAO_SOCIAL\", NR_CNPJ, NR_INSC_ESTADUAL, initcap(DS_EMAIL) \"DS_EMAIL\", DS_PASSWORD "
				+ "from T_AM_ABR_CLIENTE");
		ResultSet resCli = stmtCli.executeQuery();
		while (resCli.next()) {
			long cd_cliente = resCli.getLong("CD_CLIENTE");
			String razao_social = resCli.getString("DS_RAZAO_SOCIAL");
			String cnpj = resCli.getString("NR_CNPJ");
			String inscEstadual = resCli.getString("NR_INSC_ESTADUAL");
			String email = resCli.getString("DS_EMAIL");
			String passwd = resCli.getString("DS_PASSWORD");
			List<Endereco> ends_cli = new ArrayList<Endereco>();
			List<Telefone> tels_cli = new ArrayList<Telefone>();
			
			// Recuperar Endereços do Cliente
			PreparedStatement stmtEnde = conn.prepareStatement(
					"select PE.CD_PESSOA, initcap(TL.DS_TIPO_LOG) \"DS_TIPO_LOG\", initcap(L.DS_LOGRADOURO) \"DS_LOGRADOURO\", PE.NR_ENDERECO, initcap(PE.DS_COMPLEMENTO) \"DS_COMPLEMENTO\", initcap(B.NM_BAIRRO) \"NM_BAIRRO\", PE.NR_CEP, initcap(C.NM_CIDADE) \"NM_CIDADE\", E.SG_ESTADO " 
					+ "from T_AM_ABR_PESSOA_ENDE PE inner join T_AM_ABR_LOGRADOURO L on PE.NR_CEP = L.NR_CEP "
					+ "inner join T_AM_ABR_TIPO_LOG TL on TL.CD_TIPO_LOG = L.CD_TIPO_LOG "
					+ "inner join T_AM_ABR_BAIRRO B on L.CD_BAIRRO = B.CD_BAIRRO "
					+ "inner join T_AM_ABR_CIDADE C on C.CD_CIDADE = B.CD_CIDADE "
					+ "inner join T_AM_ABR_ESTADO E on E.CD_ESTADO = C.CD_ESTADO " 
					+ "where PE.CD_PESSOA = ?");
			stmtEnde.setLong(1, cd_cliente);
			ResultSet resEnde = stmtEnde.executeQuery();
			while (resEnde.next()) {
				Endereco ende = new Endereco(resEnde.getString("DS_TIPO_LOG") + " " + resEnde.getString("DS_LOGRADOURO"),
						resEnde.getString("NM_BAIRRO"), resEnde.getString("NR_CEP"), resEnde.getString("NM_CIDADE"), resEnde.getString("SG_ESTADO"),
						resEnde.getString("NR_ENDERECO"), resEnde.getString("DS_COMPLEMENTO"));
				ends_cli.add(ende);
			}
			resEnde.close();
			stmtEnde.close();
			
			// Recuperar Telefones do Cliente
			PreparedStatement stmtTel = conn.prepareStatement(
					"select P.CD_PESSOA, T.NR_DDD, T.NR_FONE, P.NR_RAMAL, initcap(TF.DS_TIPO_FONE) \"DS_TIPO_FONE\" "
					+ "from T_AM_ABR_FONE_PESSOA P "
					+ "inner join T_AM_ABR_TELEFONE T on T.CD_FONE = P.CD_FONE "
					+ "inner join T_AM_ABR_TIPO_FONE TF on TF.CD_TIPO_FONE = T.CD_TIPO_FONE "
					+ "where P.CD_PESSOA = ?");
			stmtTel.setLong(1, cd_cliente);
			ResultSet resTel = stmtTel.executeQuery();
			while (resTel.next()) {
				Telefone tel = new Telefone(resTel.getString("NR_DDD"), resTel.getString("NR_FONE"),
						resTel.getString("DS_TIPO_FONE"), resTel.getString("NR_RAMAL"));
				tels_cli.add(tel);
			}
			resTel.close();
			stmtTel.close();
			
			Cliente cliente = new Cliente(cd_cliente, tels_cli, ends_cli, razao_social, cnpj, inscEstadual, email, passwd);
			
			clientes.add(cliente);
		}
		resCli.close();
		stmtCli.close();
		
		return clientes;
	}

	public Cliente getById(int id) throws Exception {
		/*
		Cliente cli = null;
		PreparedStatement statement = conn.prepareStatement(
				"SELECT O.cd_operacao, M.cd_mercadoria, M.nm_mercadoria, M.tp_mercadoria, O.vl_preco, O.vl_quantidade, O.tp_operacao "
						+ "FROM negocmerc.OPERACAO O INNER JOIN negocmerc.MERCADORIA M "
						+ "ON (O.cd_mercadoria = M.cd_mercadoria)" + "WHERE O.cd_operacao=?");
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();

		if (result.next()) {
			cli = new Operacao(result.getInt("cd_operacao"),
					new Mercadoria(result.getInt("cd_mercadoria"), result.getString("nm_mercadoria"),
							result.getString("tp_mercadoria")),
					result.getInt("vl_quantidade"), result.getDouble("vl_preco"),
					result.getString("tp_operacao").toLowerCase());
		}
		result.close();
		statement.close();
		*/
		
		return null;
	}

	public int delete(int id) throws Exception {
		/*
		PreparedStatement statement = conn.prepareStatement("DELETE FROM NEGOCMERC.OPERACAO WHERE cd_operacao = ?");
		statement.setInt(1, id);
		int resp = statement.executeUpdate();
		statement.close();
		*/
		
		return 0;
	}
}