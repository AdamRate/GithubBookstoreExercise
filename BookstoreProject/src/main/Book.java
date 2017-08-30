package main;

public class Book {
	private String author;
	private String title;
	private String genre;
	private String yearPublished;

	public Book(String author, String title, String genre, String yearPublished) {
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.yearPublished = yearPublished;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYear() {
		return yearPublished;
	}

	public void setYear(String yearPublished) {
		this.yearPublished = yearPublished;
	}

	
	public String toString(){
		return ("Book: " + author + " "+ title +" " + genre+ " " + yearPublished);
		
	}
}
