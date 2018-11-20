package br.com.opaio.SistemaGB.service;

import java.util.Base64;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.com.opaio.SistemaGB.model.UsuarioToken;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class UsuarioTokenService {

	private Long horasExpiracao = 24l;

	private String chavePura = "indra";

	private String chaveSecreta;

	public UsuarioTokenService() {
		this.chaveSecreta = generateEncodedSecret(this.chavePura);

	}

	protected String generateEncodedSecret(String plainSecret) {
		if (StringUtils.isEmpty(plainSecret)) {
			throw new IllegalArgumentException("A chave secreta não pode ser nula ou vazia.");
		}
		return Base64.getEncoder().encodeToString(this.chavePura.getBytes());
	}

	protected Date getExpirationTime() {
		Date now = new Date();
		Long expireInMilis = TimeUnit.HOURS.toMillis(horasExpiracao);
		return new Date(expireInMilis + now.getTime());
	}

	protected UsuarioToken getUser(String encodedSecret, String token) {
		Claims claims = Jwts.parser().setSigningKey(encodedSecret).parseClaimsJws(token).getBody();
		String userName = claims.getSubject();
		UsuarioToken securityUser = new UsuarioToken();
		securityUser.setLogin(userName);
		securityUser.setPerfil((String) claims.get("role"));
		return securityUser;
	}

	public UsuarioToken getUser(String token) {
		return getUser(this.chaveSecreta, token);
	}

	protected String getToken(String encodedSecret, UsuarioToken jwtUser) {
		Date now = new Date();
		return Jwts.builder().setId(UUID.randomUUID().toString()).setSubject(jwtUser.getLogin())
				.setIssuedAt(now).setExpiration(getExpirationTime())
				.signWith(SignatureAlgorithm.HS512, encodedSecret).compact();
	}

	public String getToken(UsuarioToken jwtUser) {
		return getToken(this.chaveSecreta, jwtUser);
	}
}
