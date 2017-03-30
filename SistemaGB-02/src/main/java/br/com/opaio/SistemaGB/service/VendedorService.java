package br.com.opaio.SistemaGB.service;

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
	
	@SuppressWarnings("unchecked")
	public VendedorModel findByCodigo(VendedorModel vendedor) {
		return vendedorRepository.findOne(vendedor.getCodigo());
	}
	
	public List<VendedorModel> buscarPorCodigo(VendedorModel vendedor) {
		return (List<VendedorModel>) vendedorRepository.findAll();
	}
	
	
	public void salvar(VendedorModel vendedor){
		vendedorRepository.save(vendedor);
	}

}

