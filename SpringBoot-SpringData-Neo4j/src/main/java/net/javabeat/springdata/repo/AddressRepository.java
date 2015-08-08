package net.javabeat.springdata.repo;

import net.javabeat.springdata.data.Address;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends GraphRepository<Address>{
	
}
