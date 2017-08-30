package main;

public class MainClass {

	public static void main(String[] args) {
	ServiceClass Sc = new ServiceClass();
	
	Sc.init();
	Sc.autoBook();
	Sc.addNewBook("Adam", "Book Title", "history", "4001");
	Sc.showAllBooks();

	}

}
