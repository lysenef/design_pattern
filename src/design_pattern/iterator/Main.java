package design_pattern.iterator;

public class Main {
	public static void main(String[] args){
		
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Lion King"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Java"));
		Iterator it = bookShelf.iterator();
		while (it.hasNext()){
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}

	}
}
