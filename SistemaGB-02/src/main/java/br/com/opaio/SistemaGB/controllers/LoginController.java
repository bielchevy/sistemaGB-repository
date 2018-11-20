package br.com.opaio.SistemaGB.controllers;

import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.opaio.SistemaGB.model.UsuarioModel;
import br.com.opaio.SistemaGB.model.UsuarioToken;
import br.com.opaio.SistemaGB.service.UsuarioService;
import br.com.opaio.SistemaGB.service.UsuarioTokenService;
import br.com.opaio.SistemaGB.util.SegurancaUtil;

@RestController
@CrossOrigin
@RequestMapping("/sistemaGB")
public class LoginController{

	@PostMapping("/autenticar")
	public String autenticar(@RequestBody UsuarioModel usuario, HttpServletRequest request)
			throws NoSuchAlgorithmException, ServletException {
		
		UsuarioService usuarioService = new UsuarioService();
		
		usuario.setSenha(SegurancaUtil.gerarMD5(usuario.getSenha()));
		UsuarioModel usuarioBanco = usuarioService.buscaPorLogin(usuario);

		if (usuario == null || "".equals(usuario.getLogin()) || "".equals(usuario.getSenha())) {
			throw new ServletException("Os campos login e senha devem ser preenchidos.");
		}

		if (usuarioBanco == null) {
			throw new ServletException("Usuário não existe");
		}

		if (!usuarioBanco.getSenha().equals(usuario.getSenha())) {
			throw new ServletException("Senha Incorreta");
		}

		UsuarioToken usuarioToken = new UsuarioToken(usuarioBanco.getEmail(), usuarioBanco.getLogin(),
				usuarioBanco.getNome());
		request.getSession().setAttribute(usuarioBanco.getLogin(), usuarioBanco);
		
		UsuarioTokenService usuarioTokenService = new UsuarioTokenService();
		
		return usuarioTokenService.getToken(usuarioToken);
	}

}
