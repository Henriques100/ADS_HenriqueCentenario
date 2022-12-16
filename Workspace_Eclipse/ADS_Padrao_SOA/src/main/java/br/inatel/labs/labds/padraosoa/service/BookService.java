package br.inatel.labs.labds.padraosoa.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inatel.labs.labds.padraosoa.model.entity.Book.Book;
import jakarta.annotation.PostConstruct;

@Service
public class BookService {
	
	private List<Book> bookList = new ArrayList<>();
	
	@GetMapping
	public List<Book> searchBook (){
		return bookList;
	}
	
	@PostConstruct
	private void setup()
	{
		Book b1 = new Book(1L, "Delphin Blanco", "Contos");
		Book b2 = new Book(2L, "Python com Matemática", "Programação");
		Book b3 = new Book(3L, "Cozinha Mineira", "Gastronomia");
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
	}
	
	public java.util.Optional<Book> findBookById(Long id)
	{
		java.util.Optional<Book> opBook = bookList.stream()
			.filter( b -> b.getId().equals(id))
			.findFirst();
		
		return opBook;
	}
	
	public Book createBook(Book newBook)
	{
		Long idGerado = new Random().nextLong();
		newBook.setId(idGerado);
		bookList.add(newBook);
		return  newBook;
	}
	
	public void updateBook(Book book) {
		bookList.remove(book);
		bookList.add(book);
	}
	
	public void delete(Book book)
	 {
		 bookList.remove(book);
	 }
}
