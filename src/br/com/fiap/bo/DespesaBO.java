package br.com.fiap.bo;

import br.com.fiap.beans.Despesa;

public class DespesaBO {	
	
	//DespesaDAO dao = new DespesaDAO();
	
	//private static List<Despesa> despesas = dao.getAll();

	public static void create(Despesa despesa) throws Exception {
		if(despesa.getValor() < 0) {
			throw new Exception("A despesa deve possuir um valor positivo.");
		}
		if(despesa.getData().length() != 10) {
			throw new Exception("O formato da data deve ser \"DD/MM/AAAA\"");
		}
	}

	/*public Despesa getById(long codigo) {
		Despesa despesa = dao.getById(codigo);
		return despesa;
	}*/
	
	
	/*public Despesa getAll() throws Exception{
		List<Despesa> despesas = dao.getAll();
		return despesas;
	}*/

/*	public int remove(Despesa despesa) throws Exception {	
		new DespesaDAO().delete(despesa);
	}*/
}
