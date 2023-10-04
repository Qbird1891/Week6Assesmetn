package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2023
 * Oct 2, 2023
 */
@Entity(name="books")
@Table(name="books")
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rowId;
	
	private String title;
	private String author;
	private String category;
	private int publicationDate;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "LIBRARYID", nullable=false)
	private Library library = new Library();
	/**
	 * @return the library
	 */
	public Library getLibrary() {
		return library;
	}
	/**
	 * @param library the library to set
	 */
	public void setLibrary(Library library) {
		this.library = library;
	}
	/**
	 * @return the rowId
	 */
	public int getRowId() {
		return rowId;
	}
	/**
	 * @param rowId the rowId to set
	 */
	public void setRowId(int rowId) {
		this.rowId = rowId;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the publicationDate
	 */
	public int getPublicationDate() {
		return publicationDate;
	}
	/**
	 * @param publicationDate the publicationDate to set
	 */
	public void setPublicationDate(int publicationDate) {
		this.publicationDate = publicationDate;
	}

}
