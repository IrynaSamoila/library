package study.library.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="authors")
public class Author {
	private Long id;
	private String surname;
	private String firstName;
	private String secondName;
	
	public Author(String surname, String firstName, String secondName) {
		this.surname = surname;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public Author(String surname, String firstName) {
		this.surname = surname;
		this.firstName = firstName;
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
	
	public String toString() {
		if (this.secondName != null) {
			return "Author: " + this.firstName + " " + this.secondName + " " + this.surname;
		} else {
			return "Author: " + this.firstName + " " + this.surname;
		}
	}
}
