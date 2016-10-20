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

import br.com.fiap.beans.Honorario;

@WebServlet("/honorario")
public class HonorarioServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String data = req.getParameter("data");
		Double duracao = Double.parseDouble(req.getParameter("duracao"));
		String observacao = req.getParameter("observacao");
		
		//Honorario honorario = new Honorario(data,duracao,observacao,null,null);
		
		//HonorarioBO bo = new HonorarioBO();
		//bo.lancar(honorario);
		
		req.setAttribute("mensagem", "Honorario lançado com sucesso!");
		req.getRequestDispatcher("lancarHonorario.jsp").forward(req, resp);
	}
}
