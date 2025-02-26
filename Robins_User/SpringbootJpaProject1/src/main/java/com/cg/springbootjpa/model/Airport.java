package com.cg.springbootjpa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Airport")
public class Airport implements Serializable {
	
	    
	       String AirportName;
	       @Id
	       String AirportCode;
	       String AirportLocation;
	       
	    public Airport() {}    
	       
	    public Airport(String AirportCode) {
	    	
	    	
	    	this.AirportCode=AirportCode;
	    	
	    	
	    	
	    }
		public String getAirportName() {
			return AirportName;
		}
		public void setAirportName(String airportName) {
			AirportName = airportName;
		}
		public String getAirportCode() {
			return AirportCode;
		}
		public void setAirportCode(String airportCode) {
			AirportCode = airportCode;
		}
		public String getAirportLocation() {
			return AirportLocation;
		}
		public void setAirportLocation(String airportLocation) {
			AirportLocation = airportLocation;
		}
	       
	       

}

