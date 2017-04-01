package br.com.opaio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.opaio")
public class SistemaGb02Application {

	public static void main(String[] args) {
		SpringApplication.run(SistemaGb02Application.class, args);
	}
}
