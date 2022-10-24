package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.UsuarioTO;

public class UsuarioDAO {
	
	public static List<UsuarioTO> listaUsuarios;
	
	public UsuarioDAO() {
		if (listaUsuarios == null) {
			listaUsuarios = new ArrayList<UsuarioTO>();
			UsuarioTO user = new UsuarioTO();
			user.setLogin("ViniOlr");
			user.setNome("Vinicius");
			user.setRm(93613);
			user.setSenha("1234");
		}
	}
	
	public UsuarioTO loginDAO(UsuarioTO uto) {
		for (int i = 0; i < listaUsuarios.size(); i++) {
			if (listaUsuarios.get(i).getLogin().equals(uto.getLogin()) &&
				listaUsuarios.get(i).getSenha().equals(uto.getSenha())) {
				return listaUsuarios.get(i);
			}
		}
		return null;
	}

}
