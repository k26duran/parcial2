package edu.eci.arsw.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.validator.constraints.SafeHtml.Attribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import edu.eci.arsw.entities.City;
import edu.eci.arsw.services.WeatherService;

@RestController
@RequestMapping(value="v1/weather")
@Service
public class WeatherController {
	
	@Autowired
	WeatherService ws;
	
	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getCities(){
    	try{
            return new ResponseEntity<>(ws.getCities(), HttpStatus.OK);
        }catch(Exception e){
        	 return new ResponseEntity<>("Error no se puedieron cargar",HttpStatus.NOT_FOUND);
        }
    }
	
	@RequestMapping(method = RequestMethod.GET, value="{name}")
    public ResponseEntity<?> getCity(@PathVariable String name){
    	try{
            return new ResponseEntity<>(ws.findCity(name), HttpStatus.OK);
        }catch(Exception e){
        	 return new ResponseEntity<>("No se pudo cargar la ciudad",HttpStatus.NOT_FOUND);
        }
    }
	
	@RequestMapping(method = RequestMethod.POST, value= "{name}")
    public ResponseEntity<?> addCity(@RequestBody City c, @PathVariable String name){
    	try{
    		ws.addCity(c);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.FORBIDDEN );
        }
    }
    
  
	
}
