package com.suswagata.LibraryManagement.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.suswagata.LibraryManagement.model.libraryModel;



public interface libraryRepo extends CrudRepository<libraryModel, Integer>{

	List<libraryModel> findByGenre(String gnre);

	libraryModel findByBookId(int bookId);

	void deleteByBookId(int bookId);

}
