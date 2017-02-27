package design_pattern.iterator;

public class BookShelfIterator implements Iterator{
	//This is concrete iterator.
	private BookShelf bookShelf;
	private int index;
	public BookShelfIterator(BookShelf bookShelf){
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	public boolean hasNext(){
		if(index < bookShelf.getLength()){
			return true;
		}else{
			return false;
		}
	}
	public Object next(){
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
