package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Deportista;

@Repository
public class DeportistaDAOImpl implements DeportistaDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Deportista> getDeportistas() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<Deportista> theQuery = 
				currentSession.createQuery("from Deportista order by deporte",
						Deportista.class);
		
		// execute query and get result list
		List<Deportista> deportistas = theQuery.getResultList();
				
		// return the results		
		return deportistas;
	}

	@Override
	public void saveDeportista(Deportista theDeportista) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(theDeportista);
		
	}

	@Override
	public Deportista getDeportista(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Deportista theDeportista = currentSession.get(Deportista.class, theId);
		
		return theDeportista;
	}

	@Override
	public void deleteDeportista(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Deportista where id=:deportistaId");
		theQuery.setParameter("deportistaId", theId);
		
		theQuery.executeUpdate();		
	}

}











