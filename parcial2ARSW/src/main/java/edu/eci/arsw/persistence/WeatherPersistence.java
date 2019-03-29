package edu.eci.arsw.persistence;

import java.util.HashMap;
import java.util.Map;

import edu.eci.arsw.entities.City;
import edu.eci.arsw.persistence.impl.PersistenceException;

public interface WeatherPersistence {
		City getCityByName(String cityname)  throws PersistenceException;
		void addCity(City c)  throws PersistenceException;
		Map getCities() throws PersistenceException;
		
		
		
}
