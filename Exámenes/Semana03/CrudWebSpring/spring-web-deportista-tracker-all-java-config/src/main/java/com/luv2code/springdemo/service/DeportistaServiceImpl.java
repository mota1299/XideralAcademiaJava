package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.DeportistaDAO;
import com.luv2code.springdemo.entity.Deportista;

@Service
public class DeportistaServiceImpl implements DeportistaService {

	// need to inject customer dao
	@Autowired
	private DeportistaDAO deportistaDAO;
	
	@Override
	@Transactional
	public List<Deportista> getDeportistas() {
		return deportistaDAO.getDeportistas();
	}

	@Override
	@Transactional
	public void saveDeportista(Deportista theDeportista) {

		deportistaDAO.saveDeportista(theDeportista);
	}

	@Override
	@Transactional
	public Deportista getDeportista(int theId) {
		
		return deportistaDAO.getDeportista(theId);
	}

	@Override
	@Transactional
	public void deleteDeportista(int theId) {
		
		deportistaDAO.deleteDeportista(theId);
	}
}





