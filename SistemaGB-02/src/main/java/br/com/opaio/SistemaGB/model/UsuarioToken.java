package br.com.opaio.SistemaGB.model;

public class UsuarioToken {

	private Long codigo;
	private String nome;
	private String login;
	private String mail;
	private String Perfil;
	
	public UsuarioToken() {
	
	}
	
	public UsuarioToken(String nome, String login, String mail) {
		this.nome = nome;
		this.login = login;
		this.mail = mail;
	}
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPerfil() {
		return Perfil;
	}
	public void setPerfil(String perfil) {
		Perfil = perfil;
	}
	
	
}
