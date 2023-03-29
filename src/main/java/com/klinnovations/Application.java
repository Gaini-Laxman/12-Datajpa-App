package com.klinnovations;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.klinnovations.entity.Book;
import com.klinnovations.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		BookRepository repo = ctxt.getBean(BookRepository.class);

		// System.out.println(repo.getClass().getName());

		
		/*
		 * Book b1 = new Book(); b1.setBookId(101); b1.setBookName("Spring");
		 * b1.setBookPrice(1000.00);
		 * 
		 * Book b2 = new Book(); b2.setBookId(102); b2.setBookName("SpringBoot");
		 * b2.setBookPrice(2000.00);
		 * 
		 * Book b3 = new Book(); b3.setBookId(103); b3.setBookName("Java");
		 * b3.setBookPrice(3000.00);
		 * 
		 * Book b4 = new Book(); b4.setBookId(104); b4.setBookName("Core Java");
		 * b4.setBookPrice(4000.00);
		 * 
		 * Book b5 = new Book(); b5.setBookId(105); b5.setBookName("AWS");
		 * b5.setBookPrice(5000.00);
		 * 
		 * Book b6 = new Book(); b6.setBookId(106); b6.setBookName("Rest API");
		 * b6.setBookPrice(6000.00);
		 * 
		 * repo.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6));
		 * System.out.println("Record inserted.....");
		 */
		 

		//deleteAll
		List<Book> books = repo.deleteAllById(101);
		
		
		  //repo.deleteAll();
		
			/*
			 * if(repo.existsById(101)) { repo.deleteById(101); } else {
			 * System.out.println("Record Not Found...."); }
			 */
		
			/*
			 * List<Book> books = repo.findByBookPriceGreaterThan(3000.00); for(Book b :
			 * books) { System.out.println(b); }
			 */
		/*
		 * Optional<Book>findById=repo.findById(102);
		 * System.out.println(findById.get());
		 */

	}

}
