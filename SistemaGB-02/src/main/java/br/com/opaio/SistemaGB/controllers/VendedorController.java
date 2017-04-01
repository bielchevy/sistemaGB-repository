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
@RequestMapping("/sistemaGB")
public class VendedorController
{

	@Autowired
	private VendedorService vendedorService;
	
	@GetMapping("vendedor/buscarTodos")
	public List<VendedorModel> buscarTodos() throws Exception {

	return vendedorService.buscarTodos();
	
	}
	
	@GetMapping("vendedor/buscarTodosAtivos")
	public List<VendedorModel> buscarTodosAtivos() throws Exception {

	return vendedorService.buscarTodosAtivos();
	
	}
	
	@PostMapping("vendedor/salvar")
	public String salvar(@RequestBody VendedorModel vendedor) throws Exception {

		vendedorService.salvar(vendedor);
		
		return "Usuario"+vendedor.getNome()+"salvo com sucesso!";
	
	}
	
	@PostMapping("vendedor/buscarPorCodigo")
	public VendedorModel findByCodigo(@RequestBody VendedorModel vendedor) throws Exception {

		return vendedorService.findByCodigo(vendedor);
	
	}
	
	@PostMapping("vendedor/deletar")
	public String deletar(@RequestBody VendedorModel vendedor) throws Exception {

		vendedorService.deletar(vendedor);
		
		return "Usuario"+vendedor.getNome()+"deletado com sucesso!";
	
	}
	
	public String index() {
	      return "home/index";
	}
	

}
