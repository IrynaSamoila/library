package study.library.dao;

import java.util.Date;

import study.library.entities.BookLending;

import org.hibernate.HibernateException;
import org.hibernate.Query;

public class BookLendingDAO extends DAO{
	public BookLending createBookLending(Long bookId, Long readerId, Long librarianId, Date lendingDate, Date expireDate) throws Exception {
        try {
        	begin();
        	BookLending bookLending = new BookLending(bookId, readerId, librarianId, lendingDate, expireDate);
            getSession().save(bookLending);
            commit();
            return bookLending;
        } catch (HibernateException e) {
        	rollback();
            throw new Exception("Could not create bookLending with bookId" + bookId, e);
        }
	}
}
