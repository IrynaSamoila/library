package study.library.dao;

import study.library.entities.Author;

import org.hibernate.HibernateException;
import org.hibernate.Query;

public class AuthorDAO extends DAO{
	public Author createAuthor(String surname, String firstName, String secondName) throws Exception {
        try {
        	begin();
        	Author author = new Author(surname, firstName, secondName);
            getSession().save(author);
            commit();
            return author;
        } catch (HibernateException e) {
        	rollback();
            throw new Exception("Could not create author " + firstName + " "  + secondName + " " + surname, e);
        }
	}
	
	public Author createAuthor(String surname, String firstName) throws Exception {
        try {
        	begin();
        	Author author = new Author(surname, firstName);
            getSession().save(author);
            commit();
            return author;
        } catch (HibernateException e) {
        	rollback();
            throw new Exception("Could not create author " + firstName + " " + surname, e);
        }
	}

}
