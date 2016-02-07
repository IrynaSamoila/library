package study.library.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_lending")
public class BookLending {
	private Long id;
	private Long bookId;
	private Long readerId;
	private Long librarianId;
	private Date lendingDate;
	private Date expireDate;
	
	public BookLending(Long bookId, Long readerId, Long librarianId, Date lendingDate, Date expireDate) {
		this.bookId = bookId;
		this.readerId = readerId;
		this.librarianId = librarianId;
		this.lendingDate = lendingDate;
		this.expireDate = expireDate;
	}
	
	@Id
    @GeneratedValue
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="book_id")
	public Long getBookId() {
		return bookId;
	}
	
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	
	@Column(name="reader_id")
	public Long getReaderId() {
		return readerId;
	}
	
	public void setReaderId(Long readerId) {
		this.readerId = readerId;
	}
	
	@Column(name="librarian_id")
	public Long getLibrarianId() {
		return librarianId;
	}
	
	public void setLibrarianId(Long librarianId) {
		this.librarianId = librarianId;
	}
	
	@Column(name="lending_date")
	public Date getLendingDate() {
		return lendingDate;
	}
	
	public void setLendingDate(Date lendingDate) {
		this.lendingDate = lendingDate;
	}
	
	@Column(name="expire_date")
	public Date getExpireDate() {
		return expireDate;
	}
	
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	
	public String toString() {
		return "Book lending bookId " + this.bookId;
		
	}
}
