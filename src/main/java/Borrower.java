import java.util.ArrayList;

public class Borrower {

	private String name;
	private ArrayList<Book> collection;

	public Borrower(String name) {
		this.name = name;
		this.collection = new ArrayList<>();
	}

	public int getBookBorrowCount() {
		return this.collection.size();
	}

	public void addBookToBorrowedCollection(Book book) {
		this.collection.add(book);

	}

}
