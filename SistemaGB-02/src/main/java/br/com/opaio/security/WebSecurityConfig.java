package br.com.opaio.security;
 
import org.springframework.context.annotation.Configuration;
 
@Configuration

public class WebSecurityConfig {
    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        	
    	http.authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/sistemaGB/vendedor/buscarTodos").permitAll()
                .and().logout().permitAll();
    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");
    }*/
}