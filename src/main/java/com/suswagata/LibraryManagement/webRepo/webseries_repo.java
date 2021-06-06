package com.suswagata.LibraryManagement.webRepo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.suswagata.LibraryManagement.model.series;

public interface webseries_repo extends CrudRepository<series, Integer>{
	Optional<series> findByName(String name);
}
