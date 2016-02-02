package study.library.dao;

import java.util.Date;

import study.library.entities.Librarian;
import study.library.entities.Reader;

import org.hibernate.HibernateException;
import org.hibernate.Query;

public class LibrarianDAO extends DAO{
	public Librarian createLibrarian(String surname, String firstName, String secondName, String login, String passwordHash, int isActive) throws Exception {
	        try {
	        	begin();
	        	Librarian librarian = new Librarian(surname, firstName, secondName, login, passwordHash, isActive);//("Super", "Detka", "Koketka", "superDetka", "12345", 1);	        	
	            getSession().save(librarian);
	            commit();
	            return librarian;
	        } catch (HibernateException e) {
	        	rollback();
	            throw new Exception("Could not create librarian " + firstName + " " + secondName + " " + surname, e);
	        }
	}
	
	public Librarian createLibrarian(String surname, String firstName, String login, String passwordHash, int isActive) throws Exception {
        try {
        	begin();
        	Librarian librarian = new Librarian(surname, firstName, login, passwordHash, isActive);//	        	
            getSession().save(librarian);
            commit();
            return librarian;
        } catch (HibernateException e) {
        	rollback();
            throw new Exception("Could not create librarian " + firstName + " " + surname, e);
        }
}
}
