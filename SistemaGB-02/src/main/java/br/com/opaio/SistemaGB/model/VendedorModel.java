package br.com.opaio.SistemaGB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="VENDEDOR")
public class VendedorModel {
	
	@Id
	//@GeneratedValue
	@Column(name="COD_VENDEDOR")
	private Long codigo;
	
	
	@Column(name="NOM_VENDEDOR")
	private String nome;
	
	
	@Column(name="CPF")
	private String cpf;
	
	@Column(name="NUM_TELEFONE")
	private Integer telefone;
	
	
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
	public void String(String cpf) {
		this.cpf = cpf;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

}
