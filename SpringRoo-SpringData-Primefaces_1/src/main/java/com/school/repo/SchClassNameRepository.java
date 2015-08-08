package com.school.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.school.model.SchClassName;

@Repository
public interface SchClassNameRepository extends CrudRepository<SchClassNameb,Integer>{
	
}
