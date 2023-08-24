package Practice;

import java.util.ArrayList;

class Book {
	String title, author, ISBN;
	static ArrayList<Book> bookCollection = new ArrayList<Book>();

	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}

	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		settitle(title);
	}

	public String getauthor() {
		return author;
	}

	public void setauthor(String author) {
		setauthor(author);
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		setISBN(ISBN);
	}

	public static void addbook(Book book) {
		bookCollection.add(book);
	}

	public static void removebook(Book book) {
		bookCollection.remove(book);
	}

	public static ArrayList<Book> bookCollection() {
		return bookCollection;
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Java", "Python", "123456");
		Book b2 = new Book("C", "Html", "987654");
		Book.addbook(b1);
		Book.addbook(b2);
		ArrayList<Book> bookCollection = Book.bookCollection();
		System.out.println("List of books:");
		
		for (Book book : bookCollection) {
			System.out.println(book.gettitle() + " by " + book.getauthor() + ", ISBN: " + book.getauthor());
		}
		
		Book.removebook(b1);
		System.out.println("\nAfter removing " + b1.gettitle() + ":");
		System.out.println("List of books:");
		for (Book book : bookCollection) {
			System.out.println(book.gettitle() + " by " + book.getauthor() + ", ISBN: " + book.getISBN());
		}
	}
}
