package br.com.fiap.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.beans.Processo;
import br.com.fiap.bo.ProcessoBO;
import br.com.fiap.db.ConnectionFactory;

@WebServlet("/processos")
public class ProcessoServlet extends HttpServlet{

	private static final long serialVersionUID = -1079415543766042044L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection conn = null;
		try{
			conn = ConnectionFactory.controlInstance().getConnection();
			
			
			
		}catch(Exception e){
			req.setAttribute("mensagem", e.getMessage());
			req.getRequestDispatcher("listarProcessos.jsp").forward(req, resp);
		}finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
