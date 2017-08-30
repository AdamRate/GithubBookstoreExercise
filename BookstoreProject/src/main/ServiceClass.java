package main;

import java.util.HashMap;
import java.util.Map;
import main.Book;

public class ServiceClass {

	private int ID;
	private Map<Integer, Book> bookMap;

	public void init() {
		this.bookMap = new HashMap<Integer, Book>();
		ID =1;
	}

	public void addNewBook(String author, String title, String genre, String yearPublished ) {
		ID++;
		Book newBook = new Book(author, title, genre, yearPublished);
		bookMap.put(ID, newBook);
	}
	
	public void autoBook(){
		Book aBook = new Book("Test Author", "Test Title", "Test Genre", "Test Year");
		bookMap.put(1, aBook);
	}
	
	public void showAllBooks(){
		for (int num = 0; num<bookMap.size(); num++){
			System.out.println(bookMap.get(num+1));
		}
	}
	
	public void removeBook(int i){
		bookMap.remove(i);
	}
	
	public void showABook(int i){
		System.out.println(bookMap.get(i));
	}

}
