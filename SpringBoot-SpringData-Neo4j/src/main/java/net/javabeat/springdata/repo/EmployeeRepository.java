package net.javabeat.springdata.repo;

import net.javabeat.springdata.data.Employee;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends GraphRepository<Employee>{
	
}
