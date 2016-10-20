package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

public final class ClienteBO {
	public static List<Cliente> getAll() throws Exception {
		ClienteDAO dao = new ClienteDAO();
		List<Cliente> clientes = dao.getAll();
		
		return clientes;
	}
}
