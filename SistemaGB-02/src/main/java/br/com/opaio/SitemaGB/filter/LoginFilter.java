package br.com.opaio.SitemaGB.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.opaio.SistemaGB.service.UsuarioTokenService;

public class LoginFilter implements Filter {

	private UsuarioTokenService usuarioTokenService = new UsuarioTokenService();

	private static final String AUTH_HEADER = "auth-token";

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		final HttpServletRequest httpRequest = (HttpServletRequest) request;
		final HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.setHeader("Access-Control-Allow-Origin", "*");

		// without this header jquery.ajax calls returns 401 even after
		// successful login and SSESSIONID being succesfully stored.
		httpResponse.setHeader("Access-Control-Allow-Credentials", "true");

		httpResponse.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
		httpResponse.setHeader("Access-Control-Max-Age", "3600");
		httpResponse.setHeader("Access-Control-Allow-Headers",
				"X-Requested-With, Authorization, Origin, Content-Type, Version");
		httpResponse.setHeader("Access-Control-Expose-Headers",
				"X-Requested-With, Authorization, Origin, Content-Type");

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}
}
