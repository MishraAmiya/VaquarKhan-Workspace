package com.pilligram.phase1.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pilligram.phase1.model.AdminTask;

@RepositoryRestResource
public interface AdminTaskRepository extends CrudRepository<AdminTask, String> {

	List<AdminTask> findByPlaceName(@Param("placeName") String placeName);

	List<AdminTask> findByPlaceDescription(
			@Param("placeDescription") String placeDescription);

}
