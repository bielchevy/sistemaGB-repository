package br.com.opaio.SistemaGB.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VENDEDOR")
public class VendedorModel {
	
	@Id
	@GeneratedValue
	@Column(name="COD_VENDEDOR")
	private Long codigo;
	
	
	@Column(name="NOM_VENDEDOR")
	private String nome;
	
	
	@Column(name="CPF")
	private String cpf;
	
	@Column(name="NUM_TELEFONE")
	private Integer telefone;
	
	@Column(name="DAT_CADASTRO")
	private Date dataCadastro;
	
	@Column(name="DAT_RETIRADA")
	private Date dataRetirada;
	
	
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
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Date getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	
	

}
