package com.klinnovations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.klinnovations.entity.Book;
import com.klinnovations.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		
		
		  ConfigurableApplicationContext ctxt =
		  SpringApplication.run(Application.class, args);
		  
		  BookRepository repo = ctxt.getBean(BookRepository.class);
		  
		  //System.out.println(repo.getClass().getName());
		  
			
			  Book b = new Book();
			  b.setBookId(101); 
			  b.setBookName("Spring");
			  b.setBookPrice(1000.00); 
			  
			  repo.save(b);
			  
			  System.out.println("Record inserted.....");
			 
		 
	}

}
