package study.library;

import study.library.entities.Book;
import study.library.dao.BookDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BookDAO bookDAO = new BookDAO();
    	Book book;
		try {
			book = bookDAO.createBook(23l, "Java suxxxx", 2016l, "RPU78YT");
			System.out.println(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
