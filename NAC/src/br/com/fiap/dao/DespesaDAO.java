package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Despesa;
import br.com.fiap.db.ConnectionFactory;
import br.com.fiap.excecoes.Excecoes;

public class DespesaDAO {

	public DespesaDAO() throws Exception {

	}
	
	public int create(Connection conn, Despesa desp, long numProcesso) throws Excecoes, SQLException {
		PreparedStatement stmt = conn.prepareStatement(
			"INSERT INTO T_AM_ABR_LANCA_DESPESA (NR_PROCESSO, CD_TIPO_DESPESA, DT_DESPESA, VL_DESPESA, DS_OBSERVACAO) VALUES " +
			"(?, (select CD_TIPO_DESPESA from T_AM_ABR_TIPO_DESPESA where DS_TIPO_DESPESA = ?), ?, ?, ?)");
		stmt.setLong(1, numProcesso);
		stmt.setString(2, desp.getTipo().toUpperCase());
		stmt.setString(3, desp.getData());
		stmt.setDouble(4, desp.getValor());
		stmt.setString(5, desp.getObservacao().toUpperCase());
		int resp = stmt.executeUpdate();
		stmt.close();
		
		return resp;
	}
	
	public int update(Connection conn, Despesa desp, long numProcesso) throws Excecoes, SQLException {
		PreparedStatement stmt = conn.prepareStatement(
				"UPDATE T_AM_ABR_LANCA_DESPESA SET NR_PROCESSO = ?, CD_TIPO_DESPESA = (SELECT CD_TIPO_DESPESA " +
				"FROM T_AM_ABR_TIPO_DESPESA WHERE DS_TIPO_DESPESA = ?), DT_DESPESA = TO_DATE(?,'dd/mm/yyyy'), VL_DESPESA = ?, DS_OBSERVACAO = ? " +
				"WHERE CD_LANCAMENTO = ?");
		stmt.setLong(1, numProcesso);
		stmt.setString(2, desp.getTipo().toUpperCase());
		stmt.setString(3, desp.getData());
		stmt.setDouble(4, desp.getValor());
		stmt.setString(5, desp.getObservacao().toUpperCase());
		stmt.setLong(6, desp.getCodigo());
		int resp = stmt.executeUpdate();
		stmt.close();
		
		return resp;
	}
	
	public List<Despesa> getAll(Connection conn, long numProcesso) throws Excecoes, SQLException {
		List<Despesa> despesas = new ArrayList<Despesa>();
		
		// Recuperar Despesas
		PreparedStatement stmtDesp = conn.prepareStatement(
			"SELECT D.CD_LANCAMENTO, D.NR_PROCESSO, TD.DS_TIPO_DESPESA, D.DT_DESPESA, D.VL_DESPESA, D.DS_OBSERVACAO " +
			"FROM T_AM_ABR_LANCA_DESPESA D " + 
			"INNER JOIN T_AM_ABR_TIPO_DESPESA TD ON (TD.CD_TIPO_DESPESA = D.CD_TIPO_DESPESA) " +
			"WHERE D.NR_PROCESSO = ?");
		stmtDesp.setLong(1, numProcesso);
		ResultSet resDesp = stmtDesp.executeQuery();
		while (resDesp.next()) {
			long codigo = resDesp.getLong("CD_LANCAMENTO");
			String tipo = resDesp.getString("DS_TIPO_DESPESA");
			String data = resDesp.getString("DT_DESPESA");
			double valor = resDesp.getDouble("VL_DESPESA");
			String observacao = resDesp.getString("DS_OBSERVACAO");
			despesas.add(new Despesa(codigo,tipo,data,valor,observacao));
		}
		
		return despesas;
	}
	
	public Despesa getById(Connection conn, long numProcesso, long id) throws Excecoes, SQLException {
		Despesa despesa = null;
		
		PreparedStatement stmtDesp = conn.prepareStatement(
				"SELECT D.CD_LANCAMENTO, D.NR_PROCESSO, TD.DS_TIPO_DESPESA, D.DT_DESPESA, D.VL_DESPESA, D.DS_OBSERVACAO " +
				"FROM T_AM_ABR_LANCA_DESPESA D " + 
				"INNER JOIN T_AM_ABR_TIPO_DESPESA TD ON (TD.CD_TIPO_DESPESA = D.CD_TIPO_DESPESA) " +
				"WHERE D.NR_PROCESSO = ? AND D.CD_LANCAMENTO = ?");
			stmtDesp.setLong(1, numProcesso);
			stmtDesp.setLong(2, id);
			ResultSet resDesp = stmtDesp.executeQuery();
			while (resDesp.next()) {
				long codigo = resDesp.getLong("CD_LANCAMENTO");
				String tipo = resDesp.getString("DS_TIPO_DESPESA");
				String data = resDesp.getString("DT_DESPESA");
				double valor = resDesp.getDouble("VL_DESPESA");
				String observacao = resDesp.getString("DS_OBSERVACAO");
				despesa = new Despesa(codigo,tipo,data,valor,observacao);
			}
		return despesa;
	}
	
	public int delete(Connection conn, long id) throws Exception {
		PreparedStatement statement = conn.prepareStatement("DELETE FROM T_AM_ABR_LANCA_DESPESA WHERE CD_LANCAMENTO = ?");
		statement.setLong(1, id);
		int resp = statement.executeUpdate();
		statement.close();
		
		return resp;
	}
}