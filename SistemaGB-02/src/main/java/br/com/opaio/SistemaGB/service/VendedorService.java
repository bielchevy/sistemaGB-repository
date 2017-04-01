package br.com.opaio.SistemaGB.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.opaio.SistemaGB.model.VendedorModel;
import br.com.opaio.SistemaGB.repository.VendedorRepository;



@Service
public class VendedorService  {
	
	@Autowired
	private VendedorRepository vendedorRepository;

	
	public List<VendedorModel> buscarTodos() {
		return (List<VendedorModel>) vendedorRepository.findAll();
	}
	
	public List<VendedorModel> buscarTodosAtivos() {
		return (List<VendedorModel>) vendedorRepository.findByDataRetiradaIsNullOrderByNome();
	}
	
	@SuppressWarnings("unchecked")
	public VendedorModel findByCodigo(VendedorModel vendedor) {
		return vendedorRepository.findOne(vendedor.getCodigo());
	}
	
	public List<VendedorModel> buscarPorCodigo(VendedorModel vendedor) {
		return (List<VendedorModel>) vendedorRepository.findAll();
	}
	
	
	public void salvar(VendedorModel vendedor){
		
		if(vendedor.getDataCadastro() == null){
			vendedor.setDataCadastro(new Date());
		}
		vendedorRepository.save(vendedor);
	}
	
	public void deletar(VendedorModel vendedor){
		
		vendedor = vendedorRepository.findOne(vendedor.getCodigo());
		if(vendedor.getDataCadastro() != null){
			vendedor.setDataRetirada(new Date());
		}
		vendedorRepository.save(vendedor);
	}

}

