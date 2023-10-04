package Helpers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import models.Books;

/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2023
 * Oct 2, 2023
 */
public class BooksHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Week6AssesmetnQbirdsley");

	
	public void persist(Books model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Books model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Books.class, model.getRowId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Books> showAllBooks() {
		EntityManager manager = factory.createEntityManager();
		List<Books> allItems = manager.createQuery("SELECT i FROM books i").getResultList();
		manager.close();
		return allItems;
	}
	
	public void update(Books model) {
		EntityManager manager = factory.createEntityManager();
		Books dbEntity = manager.find(Books.class, model.getRowId());
		manager.getTransaction().begin();
		dbEntity.setTitle(model.getTitle());
		dbEntity.setAuthor(model.getAuthor());
		dbEntity.setCategory(model.getCategory());
		dbEntity.setPublicationDate(model.getPublicationDate());
		manager.getTransaction().commit();
		manager.close();
	}
	
	public Books searchByBookName(String oldTitle) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Books> query = manager.createQuery("SELECT i FROM books AS i WHERE i.title = :title", Books.class);
		query.setParameter("title", oldTitle);
		Books dbEntity = query.getSingleResult();
		return dbEntity;
	}
}
