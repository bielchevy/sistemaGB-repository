package br.com.opaio.SistemaGB.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.opaio.SistemaGB.model.UsuarioModel;
import br.com.opaio.SistemaGB.model.VendedorModel;
import br.com.opaio.SistemaGB.repository.UsuarioRepository;



@Service
public class UsuarioService  {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	
	public List<UsuarioModel> buscarTodos() {
		return (List<UsuarioModel>) usuarioRepository.findAll();
	}
	
	public UsuarioModel buscaPorLogin(UsuarioModel usuario) {
		return usuarioRepository.findBylogin(usuario);

	}
	
	public List<UsuarioModel> buscarTodosAtivos() {
		return (List<UsuarioModel>) usuarioRepository.findByDataDesativacaoIsNullOrderByNome();
	}
	
	@SuppressWarnings("unchecked")
	public UsuarioModel findByCodigo(UsuarioModel usuario) {
		return usuarioRepository.findOne(usuario.getCodigo());
	}
	
	public List<UsuarioModel> buscarPorCodigo(UsuarioModel usuario) {
		return (List<UsuarioModel>) usuarioRepository.findAll();
	}
	
	
	public void salvar(UsuarioModel usuario){
		
		if(usuario.getDataCadastro()== null){
			usuario.setDataCadastro(new Date());
		}
		usuarioRepository.save(usuario);
	}
	
	public void deletar(UsuarioModel usuario){
		
		usuario = usuarioRepository.findOne(usuario.getCodigo());
		if(usuario.getDataCadastro() != null){
			usuario.setDataDesativacao(new Date());
		}
		usuarioRepository.save(usuario);
	}

}

