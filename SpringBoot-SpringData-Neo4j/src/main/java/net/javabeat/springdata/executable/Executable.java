package net.javabeat.springdata.executable;

import org.neo4j.graphdb.GraphDatabaseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.rest.SpringRestGraphDatabase;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
@ComponentScan("net.javabeat")
@Configuration
@EnableNeo4jRepositories("net.javabeat.springdata.repo")
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
public class Executable extends Neo4jConfiguration {

	public Executable() {
	}

	@Bean(destroyMethod = "shutdown")
	public GraphDatabaseService graphDatabaseService() {
		SpringRestGraphDatabase service = new SpringRestGraphDatabase("http://localhost:7474/db/data/");
		this.setBasePackage("net.javabeat");
		return service;
	}

	public static void main(String[] args) {
		SpringApplication.run(Executable.class, args);
	}
}
