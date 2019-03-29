package edu.eci.arsw.persistence.impl;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import edu.eci.arsw.entities.City;
import edu.eci.arsw.persistence.WeatherPersistence;
import http.HttpConnectionExample;

@Component("InMemoryWeatherPersistence")
public class InMemoryWeatherPersistence implements WeatherPersistence{
	Map<String, City> cities= new HashMap<>();
	
	public InMemoryWeatherPersistence(HashMap cities) {
		this.cities=cities;
	}

	@Override
	public City getCityByName(String cityname) throws PersistenceException{
		try {
			if(cities.containsKey(cityname)) {
				return cities.get(cityname);
			}
		}catch(Exception e) {
			e.getMessage();
		}
		return null;
		
	}

	@Override
	public void addCity(City c) {
		try {
			cities.put(c.getName(), c);
			
		}catch(Exception e) {
			e.getMessage();
		}
	}

	@Override
	public Map getCities() throws PersistenceException {
		return cities;
	}
	
	
}
