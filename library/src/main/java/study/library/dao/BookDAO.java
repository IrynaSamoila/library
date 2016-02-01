package study.library.dao;

import study.library.entities.Book;
import org.hibernate.HibernateException;
import org.hibernate.Query;

public class BookDAO extends DAO{
	public Book createBook(Long authorId, String title, Long pubYear, String isbn) throws Exception {
	        try {
	        	begin();
	        	Book book = new Book(authorId, title, pubYear, isbn);
	            getSession().save(book);
	            commit();
	            return book;
	        } catch (HibernateException e) {
	        	rollback();
	            throw new Exception("Could not create book " + title, e);
	        }
	}
}
