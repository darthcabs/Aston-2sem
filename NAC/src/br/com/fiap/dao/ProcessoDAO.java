package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Forum;
import br.com.fiap.beans.Processo;

public class ProcessoDAO {
	
	public ProcessoDAO() throws Exception{
	}
	
	/*public List<Processo> getAll() throws Exception{
		List<Processo> processos = new ArrayList<Processo>();
		
		PreparedStatement stmtProc = conn
				.prepareStatement("SELECT NR_PROCESSO, "
						+ "CD_FORUM, CD_CLIENTE, CD_ADVOGADO,"
						+ "CD_CAUSA, DS_PROCESSO, DT_ABERTURA,"
						+ "DT_FECHAMENTO, DT_DIA_VENCIMENTO,"
						+ "NR_RESULTADO, NR_SITUACAO, DS_OBSERVACAO");
		ResultSet resProc = stmtProc.executeQuery();
		while(resProc.next()){
			long nrProcesso = resProc.getLong("NR_PROCESSO");
			long codigoForum = resProc.getLong("CD_FORUM");
			
			Cliente cliente = new Cliente();
			
		}
		return null;
	}*/
	
	public List<Processo> getAllIdDesc(Connection conn) throws Exception, SQLException{
		List<Processo> processos = new ArrayList<Processo>();
		
		PreparedStatement stmtProc = conn
				.prepareStatement(		"SELECT  NR_PROCESSO,"
									+	"( SELECT DS_FORUM FROM T_AM_ABR_FORUM F WHERE F.CD_FORUM = P.CD_FORUM) AS \"FORUM\","
									+	"( SELECT NM_PESSOA FROM T_AM_ABR_PESSOA P INNER JOIN T_AM_ABR_CLIENTE C ON (P.CD_PESSOA = C.CD_CLIENTE) WHERE C.CD_CLIENTE = P.CD_CLIENTE) AS \"CLIENTE\","
									+	"( SELECT NM_PESSOA FROM T_AM_ABR_PESSOA P INNER JOIN T_AM_ABR_ADVOGADO A ON (P.CD_PESSOA = A.CD_ADVOGADO) WHERE A.CD_ADVOGADO = P.CD_ADVOGADO) AS  \"ADVOGADO\","
									+ 	"( SELECT DS_CAUSA FROM T_AM_ABR_TIPO_CAUSA TC WHERE TC.CD_CAUSA = P.CD_CAUSA) AS \"CAUSA\", "
									+ 	"DS_PROCESSO, "
									+ 	"DT_ABERTURA, "
									+ 	"DT_FECHAMENTO, "
									+ 	"DT_DIA_VENCIMENTO, "
									+ 	"NR_RESULTADO, "
									+ 	"NR_SITUACAO, "
									+ 	"DS_OBSERVACAO "
									+ 	"FROM T_AM_ABR_PROCESSO P");
		ResultSet resProc = stmtProc.executeQuery();
		
		while(resProc.next()){
			long numero = resProc.getLong("NR_PROCESSO");
			String descricao = resProc.getString("DS_PROCESSO");
			Forum forum = new Forum(resProc.getString("FORUM"));
			Cliente cliente = new Cliente(resProc.getString("CLIENTE"));
			Processo processo = new Processo(numero,descricao,forum,cliente);
			
			processos.add(processo);
		}
		resProc.close();
		stmtProc.close();
		return processos;
	}
	
	public Processo getById( Connection conn,long numPesq) throws Exception, SQLException{
		PreparedStatement stmtProc = conn
				.prepareStatement(		"SELECT  NR_PROCESSO,"
						+	"( SELECT DS_FORUM FROM T_AM_ABR_FORUM F WHERE F.CD_FORUM = P.CD_FORUM) AS \"FORUM\","
						+	"( SELECT NM_PESSOA FROM T_AM_ABR_PESSOA P INNER JOIN T_AM_ABR_CLIENTE C ON (P.CD_PESSOA = C.CD_CLIENTE) WHERE C.CD_CLIENTE = P.CD_CLIENTE) AS \"CLIENTE\","
						+	"( SELECT NM_PESSOA FROM T_AM_ABR_PESSOA P INNER JOIN T_AM_ABR_ADVOGADO A ON (P.CD_PESSOA = A.CD_ADVOGADO) WHERE A.CD_ADVOGADO = P.CD_ADVOGADO) AS  \"ADVOGADO\","
						+ 	"( SELECT DS_CAUSA FROM T_AM_ABR_TIPO_CAUSA TC WHERE TC.CD_CAUSA = P.CD_CAUSA) AS \"CAUSA\", "
						+ 	"DS_PROCESSO, "
						+ 	"DT_ABERTURA, "
						+ 	"DT_FECHAMENTO, "
						+ 	"DT_DIA_VENCIMENTO, "
						+ 	"NR_RESULTADO, "
						+ 	"NR_SITUACAO, "
						+ 	"DS_OBSERVACAO "
						+ 	"FROM T_AM_ABR_PROCESSO P "
						+ 	"WHERE NR_PROCESSO = ?");
		stmtProc.setLong(1, numPesq);
		ResultSet resProc = stmtProc.executeQuery();
		Processo processo = null;
		if(resProc.next()){
			long numero = resProc.getLong("NR_PROCESSO");
			String descricao = resProc.getString("DS_PROCESSO");
			Forum forumObj = new Forum(resProc.getString("FORUM"));
			processo = new Processo(numero,descricao, forumObj);
		}
		resProc.close();
		stmtProc.close();
		return processo;
	}
}
