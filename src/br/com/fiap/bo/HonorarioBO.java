package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Honorario;

public class HonorarioBO {

	// HonorarioDAO dao = new HonorarioDAO();

	// private static List<Honorario> honorarios = dao.getAll();

	public static void create(Honorario honorario) throws Exception {
		if (honorario.getTarefa() == null) {
			throw new Exception("O honorário deve possuir uma tarefa válida.");
		}
		if (honorario.getData().length() != 10) {
			throw new Exception("O formato de data deve ser \"DD/MM/AAAA\"");
		}
		if (honorario.getDuracao() <= 0){
			throw new Exception ("A duração deve ser positiva.");
		}
	}

	/*
	 * public Honorario getById(long codigo) { Honorario honorario =
	 * dao.getById(codigo); return honorario; }
	 */

	/*
	 * public Honorario getAll() throws Exception{ List<Honorario> honorarios =
	 * dao.getAll(); return honorarios; }
	 */

	/*public int remove(Honorario honorario) throws Exception {
		 return HonorarioDAO().delete(honorario);
	}*/
}
