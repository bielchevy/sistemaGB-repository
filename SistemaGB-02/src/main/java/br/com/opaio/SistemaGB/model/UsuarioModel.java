package br.com.opaio.SistemaGB.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO")
public class UsuarioModel {
	
	@Id
	@GeneratedValue
	@Column(name="COD_USUARIO")
	private Long codigo;
	
	
	@Column(name="NOM_USUARIO")
	private String nome;
	
	
	@Column(name="CPF")
	private String cpf;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="LOGIN")
	private String login;
	
	@Column(name="SENHA")
	private String senha;
	
	@Column(name="DAT_DESATIVACAO")
	private Date dataDesativacao;
	
	@Column(name="DAT_CADASTRO")
	private Date dataCadastro;


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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLOGIN(String login) {
		login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setDataRetirada(Date dataDesativacao) {
		this.dataDesativacao = dataDesativacao;
	}

	public Date getDataDesativacao() {
		return dataDesativacao;
	}

	public void setDataDesativacao(Date dataDesativacao) {
		this.dataDesativacao = dataDesativacao;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	
	
	
	

}
