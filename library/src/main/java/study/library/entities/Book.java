package study.library.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	private Long id;
	private Long authorId;
	private String title;
	private Long pubYear;
	private String isbn;
	
	public Book(Long authorId, String title, Long pubYear, String isbn) {
		this.authorId = authorId;
		this.title = title;
		this.pubYear = pubYear;
		this.isbn = isbn;
	}

	@Id
    @GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="author_id")
	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name="pub_year")
	public Long getPubYear() {
		return pubYear;
	}

	public void setPubYear(Long pubYear) {
		this.pubYear = pubYear;
	}

	@Column(unique=true)
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String toString() {
		return this.title;
	}
}

