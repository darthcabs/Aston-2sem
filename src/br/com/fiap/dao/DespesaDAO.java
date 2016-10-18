package br.com.fiap.dao;

import java.sql.Connection;

import br.com.fiap.db.ConnectionFactory;

public class DespesaDAO {
	public Connection conn;
	
	public DespesaDAO() throws Exception{
		conn = new ConnectionFactory().getConnection();
	}
	
	

}
