package br.com.alura.Gerenciador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListaEmpresasServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> empresas = banco.getEmpresas();
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
        out.println("<ul>");
        for (Empresa empresa : empresas) {
			out.println("<li>" + empresa.getNome() + "</li>");
		}
        out.println("</ul>");
        out.println("</body></html>");
		
	}
}
	
	