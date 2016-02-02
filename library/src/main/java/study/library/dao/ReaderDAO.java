package study.library.dao;

import java.util.Date;

import study.library.entities.Reader;

import org.hibernate.HibernateException;
import org.hibernate.Query;

public class ReaderDAO extends DAO{
	public Reader createReader(String surname, String firstName, String secondName, String phoneNumber, String address, Date birthDate, String email, String passwordHash) throws Exception {
	        try {
	        	begin();
	        	
	        	Reader reader = new Reader();
	        	reader.setSurname(surname);
	        	reader.setFirstName(firstName);
	        	reader.setSecondName(secondName);
	        	reader.setPhoneNumber(phoneNumber);
	        	reader.setAddress(address);
	        	reader.setBirthDate(birthDate);
	        	reader.setEmail(email);
	        	reader.setPasswordHash(passwordHash);
	        	
	            getSession().save(reader);
	            commit();
	            return reader;
	        } catch (HibernateException e) {
	        	rollback();
	            throw new Exception("Could not create reader " + firstName + " " + surname, e);
	        }
	}
}
