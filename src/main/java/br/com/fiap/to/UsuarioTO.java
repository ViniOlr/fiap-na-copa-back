package br.com.fiap.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UsuarioTO {
	
	private String login, senha, nome;
	private int rm;
	
	public UsuarioTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public UsuarioTO(String login, String senha, String nome, int rm) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.rm = rm;
	}



	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	
	

}
