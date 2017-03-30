package br.com.opaio.SistemaGB.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.opaio.SistemaGB.model.VendedorModel;
import br.com.opaio.SistemaGB.service.VendedorService;

@RestController
@CrossOrigin
public class VendedorController
{

	@Autowired
	private VendedorService vendedorService;
	
	@GetMapping("sistemaGB/vendedor/buscarTodos")
	public List<VendedorModel> buscarTodos() throws Exception {

	return vendedorService.buscarTodos();
	
	}
	
	@PostMapping("sistemaGB/vendedor/salvar")
	public void salvar(@RequestBody VendedorModel vendedor) throws Exception {

		vendedorService.salvar(vendedor);
	
	}
	
	@PostMapping("sistemaGB/vendedor/buscarPorCodigo")
	public VendedorModel findByCodigo(@RequestBody VendedorModel vendedor) throws Exception {

		return vendedorService.findByCodigo(vendedor);
	
	}
	
	@RequestMapping("/")
	public String index() {
	      return "home/index";
	}
	

}
