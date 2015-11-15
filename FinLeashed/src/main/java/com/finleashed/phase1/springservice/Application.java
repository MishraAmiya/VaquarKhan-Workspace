package com.finleashed.phase1.springservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
//@ComponentScan("com.finleashed.phase1")
@ComponentScan({"com.finleashed.phase1","org.xelamitchell.sophia.server"})
@EnableJpaRepositories("com.finleashed.phase1")
@EntityScan(basePackageClasses=com.finleashed.phase1.model.Task.class)
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
@PropertySource("application.properties")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);			
	}

}