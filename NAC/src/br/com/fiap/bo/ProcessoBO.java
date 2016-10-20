package br.com.fiap.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.beans.Processo;
import br.com.fiap.dao.ProcessoDAO;

public class ProcessoBO{
	
	public List<Processo> buscarTudoIdDesc(Connection conn) throws Exception,SQLException{
		return new ProcessoDAO().getAllIdDesc(conn);
	}
	
	public Processo buscarId(Connection conn,long numero) throws Exception, SQLException{
		Processo processo = new ProcessoDAO().getById(conn, numero);
		if(processo == null){
			throw new Exception("Número inválido");
		}else{
			return processo;
		}
	}
}
