package br.com.opaio.SistemaGB.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.opaio.SistemaGB.model.VendedorModel;

@RepositoryRestResource(collectionResourceRel = "vendedorModel", path = "vendedorModels")
public interface VendedorRepository extends PagingAndSortingRepository<VendedorModel, Long>{
	
	@Query("select v from VendedorModel v where v.cpf=:cpf")
	public VendedorModel buscarPorCpf(@Param("cpf") Integer cpf);
	
	public List<VendedorModel> findByCodigo(VendedorModel vendedor);
	
}
