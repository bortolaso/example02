package eu.example.second;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.example.dao.Book;
import eu.example.service.BookManager;

public class App {

	public static void main(String[] args) throws Exception {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "spring.xml" });

		BookManager bookManager = appContext.getBean("bookManager", BookManager.class);

		List<Book> list = bookManager.getBooks();
		list.forEach(item -> System.out.println(item.getTitle()));

		((AbstractApplicationContext) appContext).close();
	}
}