package main.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@Configuration
@ComponentScan("school")
@EnableJpaRepositories("school.springdata.repo")
@EntityScan("school.springdata.jpa.data")
@PropertySource("application.properties")
@EnableAutoConfiguration
@SpringBootApplication

//
public class SchoolMgmtApplication  {

	   
	public static void main(String[] args) {
		SpringApplication.run(SchoolMgmtApplication.class, args);			
	}

}