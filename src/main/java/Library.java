import java.util.ArrayList;

public class Library {

	private String library;
	private ArrayList<Book> collectionOfBooks;

	public Library(String library) {
		this.library = library;
		this.collectionOfBooks = new ArrayList<>();
	}

	int getBookCount() {
		return this.collectionOfBooks.size();
	}


}
