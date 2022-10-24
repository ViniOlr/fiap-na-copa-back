package br.com.fiap.teste;

import br.com.fiap.bo.UsuarioBO;
import br.com.fiap.to.UsuarioTO;

public class Teste {
	
	public static void main(String[] args) {
		
		UsuarioBO ub = new UsuarioBO();
		UsuarioTO ut = new UsuarioTO("4","4","Teste", 1234);
		
		System.out.println("RESPOSTA : " + ub.validacao(ut).getLogin());

	}

}
