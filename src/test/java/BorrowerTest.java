import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

	private Borrower borrower;
	private Book book;

	@Before
	public void before(){
		borrower = new Borrower("Stevie Mays");
		book  = new Book("The Stand", "Steven King", "Fantasy");
	}

	@Test
	public void canAddToCollection(){
		borrower.addBookToBorrowedCollection(book);
		assertEquals(1, borrower.getBookBorrowCount());
	}

}
