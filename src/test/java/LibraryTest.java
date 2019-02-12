import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

	private Library library;
	private Book book;

	@Before
	public void before() {
		library = new Library("Dunfermline", 5);
	}

	@Test
	public void canGetBookCount(){
		assertEquals(0, library.getBookCount());
	}

	@Test
	public void canAddBookToLibrary(){
		library.addBook(book);
		library.addBook(book);
		library.addBook(book);
		library.addBook(book);
		library.addBook(book);
		library.addBook(book);
		library.addBook(book);
		assertEquals(5, library.getBookCount());
	}

}
