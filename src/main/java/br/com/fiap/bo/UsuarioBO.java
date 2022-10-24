package br.com.fiap.bo;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.to.UsuarioTO;

public class UsuarioBO {
	
	UsuarioDAO udao = null;
	
	public UsuarioTO validacao(UsuarioTO uto) {
		udao = new UsuarioDAO();
		return udao.loginDAO(uto);
	}

}
