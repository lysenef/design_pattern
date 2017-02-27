package design_pattern.iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate{
	//This is concrete aggregate.
	// Array type
/*	private Book[] books;
	private int last = 0;
	public BookShelf(int maxsize){
		this.books = new Book[maxsize];
	}
	public Book getBookAt(int index){
		return books[index];
	}
	public void appendBook(Book book){
		this.books[last] = book;
		last++;
	}
*/	
	//ArrayList type
	private ArrayList<Book> books;
	public BookShelf(int initialsize){
		this.books = new ArrayList<Book>(initialsize);
	}
	public Book getBookAt(int index){
		return (Book)books.get(index);
	}
	public void appendBook(Book book){
		this.books.add(book);
	}
	public int getLength(){
		return books.size();
	}
	public Iterator iterator(){
		return new BookShelfIterator(this);
	}
}
