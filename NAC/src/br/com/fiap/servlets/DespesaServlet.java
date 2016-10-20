package br.com.fiap.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.beans.Despesa;

@WebServlet("/despesa")
public class DespesaServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String data = req.getParameter("data");
		Double valor = Double.parseDouble(req.getParameter("valor"));
		String observacao = req.getParameter("observacao");
		
		//Despesa despesa = new Despesa(data,valor,observacao,null);
		
		//DespesaBO bo = new DespesaBO();
		//bo.lancar(despesa);
		
		req.setAttribute("mensagem", "Despesa lançada com sucesso!");
		req.getRequestDispatcher("lancarDespesa.jsp").forward(req, resp);
	}
}
