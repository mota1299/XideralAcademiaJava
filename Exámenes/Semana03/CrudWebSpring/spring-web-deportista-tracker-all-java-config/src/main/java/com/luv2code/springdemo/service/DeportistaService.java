package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Deportista;

public interface DeportistaService {

	public List<Deportista> getDeportistas();

	public void saveDeportista(Deportista theDeportista);

	public Deportista getDeportista(int theId);

	public void deleteDeportista(int theId);
	
}
