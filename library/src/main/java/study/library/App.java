package study.library;

import java.util.Date;
import java.util.GregorianCalendar;

import study.library.entities.Book;
import study.library.dao.BookDAO;
import study.library.entities.Reader;
import study.library.dao.ReaderDAO;
import study.library.entities.Librarian;
import study.library.dao.LibrarianDAO;
import study.library.entities.Author;
import study.library.dao.AuthorDAO;
import study.library.entities.BookLending;
import study.library.dao.BookLendingDAO;

public class App 
{
    public static void main( String[] args )
    {
    	BookDAO bookDAO = new BookDAO();
    	Book book;
    	ReaderDAO readerDAO = new ReaderDAO();
    	Reader reader;
    	LibrarianDAO librarianDAO = new LibrarianDAO();
    	Librarian librarian;
    	AuthorDAO authorDAO = new AuthorDAO();
    	Author author;
    	BookLendingDAO bookLendingDAO = new BookLendingDAO();
    	BookLending bookLending;
    	
		try {
			//book = bookDAO.createBook(23l, "Java suxxxx", 2016l, "RPU78YT");
			//reader = readerDAO.createReader("Ivanov", "Ivan", null, "+375298741222", "Grodno, ul.Labutena, 42", new GregorianCalendar(1986,11,01).getTime(), "ivanov@mail.com", "12345");
			//librarian = librarianDAO.createLibrarian("Super", "Detka", "Koketka", "superDetka", "12345", 1);
			//author = authorDAO.createAuthor("Karl", "Karlovich", "Karlovsky");
			bookLending = bookLendingDAO.createBookLending(1l, 1l, 1l, new GregorianCalendar(2016,11,01).getTime(), new GregorianCalendar(2016,11,15).getTime());
			//System.out.println(book);
			//System.out.println(reader);
			//System.out.println(librarian);
			//System.out.println(author);
			System.out.println(bookLending);
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
