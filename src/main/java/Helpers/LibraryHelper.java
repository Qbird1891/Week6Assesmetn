package Helpers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import models.Library;

/**
 * @author Itsal - Quinn Birdsley CIS175 - Fall 2021 Oct 2, 2023
 */
public class LibraryHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Week6AssesmetnQbirdsley");

	public void persist(Library model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}

	public void delete(Library model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Library.class, model.getLibraryId()));
		manager.getTransaction().commit();
		manager.close();
	}

	@SuppressWarnings("unchecked")
	public List<Library> showAllLibrary() {
		EntityManager manager = factory.createEntityManager();
		manager.clear();
		Query q = manager.createQuery("SELECT i FROM library i");
		List<Library> allItems = q.getResultList();
		manager.close();
		return allItems;
	}
	
	public void update(Library model) {
		EntityManager manager = factory.createEntityManager();
		Library dbEntity = manager.find(Library.class, model.getLibraryId());
		manager.getTransaction().begin();
		dbEntity.setNameOfLibrary(model.getNameOfLibrary());
		dbEntity.setAddress(model.getAddress());
		manager.getTransaction().commit();
		manager.close();
	}
	
	public Library searchLibraryByName(String oldnameOfLibrary) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Library> query = manager.createQuery("SELECT i FROM library AS i WHERE i.nameOfLibrary = :nameOfLibrary", Library.class);
		query.setParameter("nameOfLibrary", oldnameOfLibrary);
		Library dbEntity = query.getSingleResult();
		manager.close();
		return dbEntity;
	}
		

}
