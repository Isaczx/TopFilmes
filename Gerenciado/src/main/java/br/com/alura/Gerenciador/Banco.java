package br.com.alura.Gerenciador;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> empresas = new ArrayList<>();
	
	public void adiciona(Empresa empresa) {
		empresas.add(empresa);
		System.out.println(empresas.get(0).getNome());
		
	}
	
	
	public static List<Empresa> getEmpresas() {
		return Banco.empresas;
	}
}
