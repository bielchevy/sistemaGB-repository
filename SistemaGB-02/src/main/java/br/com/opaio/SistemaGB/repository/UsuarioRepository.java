package br.com.opaio.SistemaGB.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.opaio.SistemaGB.model.UsuarioModel;

@RepositoryRestResource(collectionResourceRel = "usuarioModel", path = "usuarioModels")
public interface UsuarioRepository extends PagingAndSortingRepository<UsuarioModel, Long>{

	
	public List<UsuarioModel> findByCodigo(UsuarioModel usuario);
	
	public List<UsuarioModel> findByDataDesativacaoIsNullOrderByNome();
	
	public UsuarioModel findBylogin(UsuarioModel usuario);
	
}
