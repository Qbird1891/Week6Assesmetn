package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2021
 * Oct 2, 2023
 */
@Entity(name="library")
@Table(name="library")
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int libraryId;
	private String nameOfLibrary;
	private String address;
	@OneToMany(mappedBy = "library", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Books> Books;
	/**
	 * @return the books
	 */
	public List<Books> getBooks() {
		return Books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(List<Books> Books) {
		this.Books = Books;
	}
	/**
	 * @return the libraryId
	 */
	public int getLibraryId() {
		return libraryId;
	}
	/**
	 * @param libraryId the libraryId to set
	 */
	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}
	/**
	 * @return the nameOfLibrary
	 */
	public String getNameOfLibrary() {
		return nameOfLibrary;
	}
	/**
	 * @param nameOfLibrary the nameOfLibrary to set
	 */
	public void setNameOfLibrary(String nameOfLibrary) {
		this.nameOfLibrary = nameOfLibrary;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param addres the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
