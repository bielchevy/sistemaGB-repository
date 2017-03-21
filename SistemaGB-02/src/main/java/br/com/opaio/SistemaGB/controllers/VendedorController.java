package br.com.opaio.SistemaGB.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.opaio.SistemaGB.model.VendedorModel;
import br.com.opaio.SistemaGB.service.VendedorService;

@RestController
public class VendedorController
{

	@Autowired
	private VendedorService vendedorService;
	
	@RequestMapping("/vendedor/buscarTodos")
	public List<VendedorModel> buscarTodos() throws Exception {

	return vendedorService.buscarTodos();
	}
	
	@RequestMapping("/")
	public String index() {
	      return "home/index";
	}
	

}
