package Rest.example.demo1.helloworld;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Books> getAllBooks()
	{
		return Arrays.asList(new Books(1l,"Harry Potter", "JK Rowling"));

	
		
	}

}
