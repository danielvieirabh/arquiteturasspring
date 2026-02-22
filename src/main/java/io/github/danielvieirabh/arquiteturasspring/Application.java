package io.github.danielvieirabh.arquiteturasspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
		builder.bannerMode(Banner.Mode.OFF); //Tirar a logo que vme no terminal
		builder.profiles("producao"); //perfil de producao para debugar em producao
		//builder.lazyInitialization(true);
		builder.run(args);

		ConfigurableApplicationContext applicationContext = builder.context();
//		applicationContext.getBean("produtoRepository");
//		builder.properties("spring.datasource.ur=jdbc://");
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String applicationNmae = environment.getProperty("spring.application.name");
		System.out.println("Nome da aplicacao: " + applicationNmae);
	}

}
