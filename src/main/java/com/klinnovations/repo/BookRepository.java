package com.klinnovations.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.klinnovations.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	
	//select * from book where book_price > : 
public List<Book> findByBookPriceGreaterThan(Double bookPrice);	

//select * from book where book_price < :
public List<Book> findByBookPriceLessThan(Double bookPrice);
 
// select * from book where book_name : 
public List<Book> findByBookName(String bookName);

public List<Book> deleteAllById(Integer Id);                   

}
