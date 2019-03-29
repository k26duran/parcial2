package edu.eci.arsw.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.eci.arsw.entities.City;
import edu.eci.arsw.persistence.impl.InMemoryWeatherPersistence;
import edu.eci.arsw.persistence.impl.PersistenceException;

@Service
public class WeatherService{
	
	@Autowired
	@Qualifier("InMemoryWeatherPersistence")
	InMemoryWeatherPersistence w;
	
		
	public City findCity(String name) throws PersistenceException{
		return w.getCityByName(name);
		
	}
	
	public Map getCities() throws PersistenceException {
		return w.getCities();
		
	}
	
	public void addCity(City c) {
		w.addCity(c);
	}
	

}
