package com.klinnovations.repo;

import org.springframework.data.repository.CrudRepository;

import com.klinnovations.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	

}
