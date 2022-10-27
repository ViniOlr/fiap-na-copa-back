package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.UsuarioTO;

public class UsuarioDAO {
	
	public static List<UsuarioTO> listaUsuario;
	
	public UsuarioDAO() {
		if (listaUsuario == null) {
			listaUsuario = new ArrayList<UsuarioTO>();
			UsuarioTO user = new UsuarioTO();
			user.setLogin("ViniOlr");
			user.setNome("Vinicius");
			user.setRm(93613);
			user.setSenha("1234");
			listaUsuario.add(user);
		}
	}
	
	/*public UsuarioTO loginDAO(UsuarioTO uto) {
		for (int i = 0; i < listaUsuarios.size(); i++) {
			if (listaUsuarios.get(i).getLogin().equals(uto.getLogin()) &&
				listaUsuarios.get(i).getSenha().equals(uto.getSenha())) {
				return listaUsuarios.get(i);
			}
		}
		return null;
	}*/
	
	public UsuarioTO loginDAO(UsuarioTO u) {
		for (int i = 0; i < listaUsuario.size(); i++) {
			if (listaUsuario.get(i).getLogin().equals(u.getLogin())
					&& listaUsuario.get(i).getSenha().equals(u.getSenha())) {
				System.out.println("USUÁRIO : " + listaUsuario.get(i).getLogin() + " LOGOU!");
				return listaUsuario.get(i);
			}
		}
		System.out.println("USUÁRIO : " + u.getLogin() + " NĂO VALIDADO!");
		return null;
	}

}
