package edu.eci.arsw.entities;

public class City {
	
	String name;
	String weather;
	
	public City() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public City(String name, String weather) {
		this.name=name;
		this.weather=weather;
	}
	
	

}
