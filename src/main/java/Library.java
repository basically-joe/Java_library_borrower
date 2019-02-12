import java.util.ArrayList;
import java.util.HashMap;

public class Library {

	private String library;
	private ArrayList<Book> collectionOfBooks;


	public Library(String library) {
		this.library = library;
		this.collectionOfBooks = new ArrayList<>();
	}

	public int getBookCount() {
		return this.collectionOfBooks.size();
	}

	public void addBook(Book book){
		this.collectionOfBooks.add(book);
	}

}
