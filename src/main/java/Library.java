import java.util.ArrayList;

public class Library {

	private String library;
	private int capacity;
	private ArrayList<Book> collectionOfBooks;


	public Library(String library, int capacity) {
		this.library = library;
		this.capacity = capacity;
		this.collectionOfBooks = new ArrayList<>();
	}

	public int getBookCount() {
		return this.collectionOfBooks.size();
	}

	public void addBook(Book book){
		if (getBookCount() < this.capacity) {
			this.collectionOfBooks.add(book);
		}
	}

}
