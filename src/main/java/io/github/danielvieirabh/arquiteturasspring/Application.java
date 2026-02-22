package io.github.danielvieirabh.arquiteturasspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableConfigurationProperties
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

		ExemploValue exemploValue = applicationContext.getBean(ExemploValue.class);
		exemploValue.imprimirVariavel();
		AppProperties appProperties = applicationContext.getBean(AppProperties.class);
		System.out.println("Valor application.yml: " + appProperties.getValor1()); //Valor la do yaml
	}

}
