package study.library.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="librarians")
public class Librarian {
	private Long id;
	private String surname;
	private String firstName;
	private String secondName;
	private String login;
	private String passwordHash;
	private int isActive;
	
	public Librarian(String surname, String firstName, String secondName, String login, String passwordHash, int isActive) {
		this.surname = surname;
		this.firstName = firstName;
		this.secondName = secondName;
		this.login = login;
		this.passwordHash = passwordHash;
		this.isActive = isActive;
	}
	
	public Librarian(String surname, String firstName, String login, String passwordHash, int isActive) {
		this.surname = surname;
		this.firstName = firstName;
		this.login = login;
		this.passwordHash = passwordHash;
		this.isActive = isActive;
	}
	
	@Id
    @GeneratedValue
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Column(name="first_name")
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name="second_name")
	public String getSecondName() {
		return secondName;
	}
	
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	@Column(name="password_hash")
	public String getPasswordHash() {
		return passwordHash;
	}
	
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	
	@Column(name="is_active")
	public int getisActive() {
		return isActive;
	}
	
	public void setisActive(int isActive) {
		this.isActive = isActive;
	}
	
	public String toString() {
		if (this.secondName != null) {
			return "Librarian: " + this.firstName + " " + this.secondName + " " + this.surname;
		} else {
			return "Librarian: " + this.firstName + " " + this.surname;
		}
	}
}

