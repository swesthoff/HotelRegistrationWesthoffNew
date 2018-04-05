package edu.dmacc.spring.hotelregistration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class HotelDao {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("HotelRegistrationWesthoffNew");

	public void insertHotel(Hotel hotelToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(hotelToAdd);
		em.getTransaction().commit();
		em.close();
		
	}

	public List<Hotel> getAllHotels() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select u from Hotel u";
		TypedQuery<Hotel> typedQuery= em.createQuery(q,Hotel.class);
		List<Hotel> all = typedQuery.getResultList();
		return all;
		
		
	}
}
