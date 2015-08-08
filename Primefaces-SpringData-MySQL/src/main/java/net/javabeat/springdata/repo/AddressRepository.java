package net.javabeat.springdata.repo;

import net.javabeat.springdata.jpa.data.Address;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer>{
	
}
